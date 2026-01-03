import { Component } from '@angular/core';
import { OrdersService } from '../orders-service';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Orders } from '../orders';

@Component({
  selector: 'app-customer-orders',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer-orders.html',
  styleUrl: './customer-orders.css',
})
export class CustomerOrders {
  cid : number;
  orders : Observable<Orders[]>;
  constructor(private _orderService : OrdersService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    // alert(this.cid);
    this.orders = this._orderService.showCustomerOrders(this.cid);

  }
}
