import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AuthService } from '../auth-service';

@Component({
  selector: 'app-login',
  imports: [CommonModule,FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  userName : string;
  passWord : string;

  login() {
    if (this.userName=="Virtusa" && this.passWord == "Virtusa") {
      this._authService.changeStatus();
      alert("Login Success...Access Home Page...");
    } else {
      alert("Invalid Credentials...");
    }
  }
  constructor(private _authService : AuthService) {

  }
}
