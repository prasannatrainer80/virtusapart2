import { Component } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { EmployService } from '../employ-service';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Auth } from '../auth';

@Component({
  selector: 'app-login',
  imports: [FormsModule, CommonModule, RouterModule, RouterOutlet],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {

  user : string;
  pwd : string; 
  auth : Auth;
  isvalid : boolean;
  error : string;
  constructor(private _router : Router, private _employService : EmployService) {
    this.auth = new Auth();
    this.isvalid = false;
  }

  doLogin(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    this.isvalid = true;
    this._employService.login(this.auth.username,this.auth.passcode).subscribe(x => {
      // alert(x);
      if (x=="1") {
          this._router.navigate(["/menu"]);
      } else {
          alert("Invalid UserName/Password...");
          this.error = "Invalid UserName/Password...";
      }
    })
  }

}
