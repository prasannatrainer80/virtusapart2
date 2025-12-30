import { Component } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { EmployService } from '../employ-service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  imports: [FormsModule, CommonModule, RouterModule, RouterOutlet],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {

  user : string;
  pwd : string; 

  constructor(private _router : Router, private _employService : EmployService) {

  }

  login() {
    this._employService.login(this.user,this.pwd).subscribe(x => {
      alert(x);
      if (x=="1") {
          this._router.navigate(["/menu"]);
      } 
    })
  }

}
