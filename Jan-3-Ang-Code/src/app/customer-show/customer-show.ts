import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { EmployService } from '../employ-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customer-show',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer-show.html',
  styleUrl: './customer-show.css',
})
export class CustomerShow {

  customers : Observable<Customer[]>;

  constructor(private _customerService : EmployService) {
    this.customers = this._customerService.showCustomer();
  }
}
