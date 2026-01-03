import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root',
})
export class EmployService {
  
  constructor(private _httpClient : HttpClient) {

  }

  showCustomer() : Observable<Customer[]> {
    return this._httpClient.get<Customer[]>("http://localhost:8888/showCustomer");
  }
  searchByCustomerUserName(cuser : string) : Observable<Customer> {
    return this._httpClient.get<Customer>("http://localhost:8888/searchByUserName/"+cuser);
  }
  //http://localhost:8888/customerLogin/krishnak/chennai@123
  login(user : string, pwd : string) : Observable<string> {
    return this._httpClient.get<string>("http://localhost:8888/customerLogin/"+user + "/" +pwd);
  }
}
