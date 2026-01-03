package com.example.controller;

import java.util.List;

import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/showCustomer")
	public List<Customer> showCustomer() {
		return customerService.showCustomer();
	}
	
	@GetMapping(value="/customerLogin/{userName}/{passCode}")
	public String loginCustomer(@PathVariable String userName, @PathVariable 
				String passCode
			) {
		int result = customerService.authentication(userName, passCode);
		String res="";
		res+=result;
		return res;
	}
	
	@GetMapping(value="/searchCustomer/{custId}")
	public ResponseEntity<Customer> searchById(@PathVariable int custId) {
		return customerService.searchByCustomerId(custId);
	}
	
	@GetMapping(value="/searchByUserName/{userName}")
	public ResponseEntity<Customer> searchByUserName(@PathVariable String userName) {
		return customerService.searchByCustomerUserName(userName);
	}
}
