import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vendor } from './vendor';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class VendorService {
  
  constructor(private _http : HttpClient) {

  }
  searchByUserName(user : string) : Observable<Vendor> {
    return this._http.get<Vendor>("http://localhost:8888/vendorUserName/"+user);
  }

  showVendorPendingOrders(vid : number) : Observable<any> {
    return this._http.get("http://localhost:9312/showVendorPendingOrders/"+vid);
  }

  showVendorOrders(vid : number) : Observable<any> {
    return this._http.get("http://localhost:9312/showVendorOrders/"+vid);
  }
  searchByVid(vid : number) : Observable<Vendor> {
    return this._http.get<Vendor>("http://localhost:9312/searchVendor/"+vid);
  }

  vendorLogin(user : string, pwd : string) : Observable<any> {
    return this._http.get("http://localhost:9312/vendorLogin/"+user+"/"+pwd);
  }
  showVendor() : Observable<Vendor[]> {
    return this._http.get<Vendor[]>("http://localhost:8888/showVendor")
  }

}
