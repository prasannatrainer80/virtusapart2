import { Component } from '@angular/core';
import { Customer } from '../customer';
import { Observable } from 'rxjs';
import { EmployService } from '../employ-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customer-info',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer-info.html',
  styleUrl: './customer-info.css',
})
export class CustomerInfo {

  customer : Observable<Customer>
  cuser : string;
  constructor(private _customerService : EmployService) {
    this.cuser = localStorage.getItem("cuser")
    this.customer = this._customerService.searchByCustomerUserName(this.cuser);
  }
}
