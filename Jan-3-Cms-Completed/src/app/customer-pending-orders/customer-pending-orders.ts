import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Orders } from '../orders';
import { OrdersService } from '../orders-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customer-pending-orders',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer-pending-orders.html',
  styleUrl: './customer-pending-orders.css',
})
export class CustomerPendingOrders {
cid : number;
  orders : Observable<Orders[]>;
  constructor(private _orderService : OrdersService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    // alert(this.cid);
    this.orders = this._orderService.showCustomerPendingOrders(this.cid);

  }
}
