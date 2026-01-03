import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Menu } from './menu';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class MenuService {

  constructor(private _http : HttpClient) {

  }

   showMenu() : Observable<Menu[]> {
    return this._http.get<Menu[]>("http://localhost:8888/showMenu");
  }

}
