import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  
  isActive : boolean = false;

  changeStatus() {
    this.isActive = true;
  }
  getStatus() : boolean {
    return this.isActive;
  }
}
