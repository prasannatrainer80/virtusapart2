import { Component } from '@angular/core';
import { AuthService } from '../auth-service';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
message : string;
public name : string;
emp : {empno : number,name : string,salary:number}
constructor(private auth: AuthService) {
  this.name = "Lokesh";
  this.emp = {
    empno:1,name:'Raj',salary:84423
  }
    this.message = auth.isAuthenticated()
      ? 'Welcome User'
      : 'Please Login';
  }
}
