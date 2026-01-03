import { Component } from '@angular/core';
import { Orders } from '../orders';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { MenuService } from '../menu-service';
import { VendorService } from '../vendor-service';
import { WalletService } from '../wallet-service';
import { OrdersService } from '../orders-service';
import { Observable } from 'rxjs';
import { Menu } from '../menu';
import { Vendor } from '../vendor';
import { Wallet } from '../wallet';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Component({
  selector: 'app-place-order',
  imports: [CommonModule,FormsModule],
  templateUrl: './place-order.html',
  styleUrl: './place-order.css',
})
export class PlaceOrder {
    menu : Observable<Menu[]>;
  vendor : Observable<Vendor[]>;
  orders : Orders;
  wallet : Observable<Wallet[]>;
  result : string;
  placeOrder(orderForm : NgForm) {
    if (orderForm.invalid) {
      return;
    }
    this._orderService.placeOrder(this.orders).subscribe(x =>{
      this.result = x;
      alert(x);
    })
    // this.result = this._orderService.placeOrder(this.orders);
   
    // alert(this.orders.cusId)
    // alert(this.orders.venId);
    // alert(this.orders.menId);
    // alert(this.orders.walSource);
  }
  constructor(private _menuService : MenuService, 
      private _venService : VendorService,
      private _walletService : WalletService,
      private _orderService : OrdersService
    ) {

    this.orders = new Orders();
    this.orders.cusId = parseInt(localStorage.getItem("cid"));

    this.menu = this._menuService.showMenu();
    this.vendor = this._venService.showVendor();
    this.wallet = this._walletService.showCustomerWallet(this.orders.cusId);

    // this._menuService.showMenu().subscribe(x => {
    //   this.menu = x;
    // })

    // this._venService.showVendor().subscribe(x => {
    //   this.vendor = x;
    // })

    // this._walletService.showCustomerWallet(this.orders.cusId).subscribe(x => {
    //   this.wallet = x;
    // })
  }

}
