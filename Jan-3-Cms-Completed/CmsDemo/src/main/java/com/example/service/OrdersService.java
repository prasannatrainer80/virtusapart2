package com.example.service;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.exception.ResourceNotFoundException;
import com.example.model.*;
import com.example.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


@Service
public class OrdersService {

//   private final MenuController menuController;

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private WalletService walletService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

//    OrdersService(MenuController menuController) {
//        this.menuController = menuController;
//    }
	
    public List<Orders> showVendorOrders(int venId) {
    	return ordersRepository.findByVenId(venId);
    }
    
    public List<Orders> showVendorPendingOrders(int venId) {
    	List<Orders> ordersList = ordersRepository.findByVenId(venId);
    	Stream<Orders> streams= ordersList.stream().filter(x -> x.getOrdStatus().toString().equals("PENDING"));
		List<Orders> result = streams.collect(Collectors.toList());
		return result;
    }
    
    public String acceptOrReject(int orderId, String status) {
    	Orders order = ordersRepository.findById(orderId).get();
    	System.out.println(order.getOrdBillamount());
    	System.out.println(order.getCusId());
    	System.out.println(order.getWalSource());
    	System.out.println(status.trim());
    	if (status.equals("YES")) {
    		System.out.println("Yes Block");
    		String cmd = "Update Orders set ORD_STATUS='ACCEPTED' "
    				+ " WHERE ORD_ID=?";
    		jdbcTemplate.update(cmd, new Object[] {orderId});
    		return "Order Accepted...";
    	} else 
    	if (status.equals("NO")) {
    		System.out.println("No Block");
    		String cmd = "Update Orders set ORD_STATUS='DENIED' "
    				+ " WHERE ORD_ID=?";
    		jdbcTemplate.update(cmd, new Object[] {orderId});
    		cmd = "Update Wallet set WAL_AMOUNT = WAL_AMOUNT + ? WHERE "
    				+ " CUS_ID = ? AND WAL_SOURCE = ?";
    		jdbcTemplate.update(cmd, new Object[] {order.getOrdBillamount(), order.getCusId(), order.getWalSource()});
    		return "Order Rejected and Amount Refunded...";
    	}
    	return "Unknown Error";
    }
	public List<Orders> showCustomerOrders(int custId) {
		return ordersRepository.findByCusId(custId);
	}
	
	public List<Orders> showCustomerPendingOrders(int custId) {
		List<Orders> ordersList = ordersRepository.findByCusId(custId);
		Stream<Orders> streams= ordersList.stream().filter(x -> x.getOrdStatus().toString().equals("PENDING"));
		List<Orders> result = streams.collect(Collectors.toList());
		return result;
	}
	
	public ResponseEntity<Orders> searchByOrderId(int orderId) {
		Orders orders = ordersRepository.findById(orderId).orElseThrow(
				() -> new ResourceNotFoundException("Order with Id " +orderId + " Not Found")
				);

			    return new ResponseEntity<>(orders, HttpStatus.OK);
	}
	
	public String placeOrder(Orders orders) {
		ResponseEntity<Wallet> wallet = walletService.showCustomerWalletInfo(orders.getCusId(),
				WalSource.valueOf(orders.getWalSource()));
		Wallet walletFound = wallet.getBody();
		double balance = walletFound.getWalAmount();
		
		ResponseEntity<com.example.model.Menu> menu = menuService.searchByMenuId(orders.getMenId());
		Menu menuFound = menu.getBody();
		double price = menuFound.getMenPrice();
		double billAmount = orders.getOrdQuantity() * price;
		if (billAmount > balance) {
			return "Insufficient Funds...";
		}
		orders.setOrdBillamount(billAmount);
		orders.setOrdStatus(OrderStatus.PENDING);
		ordersRepository.save(orders);
		
		double bal = balance - billAmount;
		
		String cmd = "Update Wallet set Wal_Amount = ? Where CUS_ID = ? AND WAL_SOURCE = ?";
		jdbcTemplate.update(cmd, new Object[] {bal,orders.getCusId(),orders.getWalSource()});
		return "Order Placed Successfully...Balance Updated";
	}
}
