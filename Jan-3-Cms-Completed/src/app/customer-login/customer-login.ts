import { CommonModule, NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Customer } from '../customer';
import { EmployService } from '../employ-service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-login',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer-login.html',
  styleUrl: './customer-login.css',
})
export class CustomerLogin {
  isvalid : boolean;
  customer : Customer
  
  constructor(private _customerService : EmployService,
private _router : Router

  ) {
    this.customer = new Customer();
    this.isvalid = false;
  }

  doLogin(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    // alert(this.customer.cusUsername);
    // alert(this.customer.cusPassword);
    this._customerService.login(this.customer.cusUsername,this.customer.cusPassword).subscribe(x => {
      // alert(x);
      if (x=="1") {
         this._customerService.searchByCustomerUserName(this.customer.cusUsername).subscribe(x => {
      localStorage.setItem("cid",x.cusId.toString())
      alert("Customer Id Stored");
    })
        this._router.navigate(["/customerDashBoard"]);
        localStorage.setItem("cuser",this.customer.cusUsername);
        alert("Correct");
      }  
    })
  }
}
