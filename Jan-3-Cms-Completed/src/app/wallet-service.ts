import { Injectable } from '@angular/core';
import { Wallet } from './wallet';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class WalletService {
  constructor(private _http : HttpClient) {

  }
    showCustomerWallet(cusId : number) : Observable<Wallet[]> {
    return this._http.get<Wallet[]>("http://localhost:8888/showCustomerWallets/"+cusId);
  }

}
