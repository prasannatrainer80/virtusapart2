import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Orders } from './orders';

@Injectable({
  providedIn: 'root',
})
export class OrdersService {
  
  constructor(private _http : HttpClient) {}

placeOrder(order: Orders): Observable<string> {
  return this._http.post(
    'http://localhost:8888/placeOrder',
    order,
    {
      responseType: 'text'   // 👈 VERY IMPORTANT
    }
  );
}

  showCustomerOrders(custId : number) : Observable<Orders[]> {
    return this._http.get<Orders[]>("http://localhost:8888/showCustomerOrders/"+custId);
  }

  showCustomerPendingOrders(custId : number) : Observable<Orders[]> {
    return this._http.get<Orders[]>("http://localhost:8888/showCustomerPendingOrders/"+custId);
  }
}
