import { Component } from '@angular/core';
import { AuthService } from '../auth-service';

@Component({
  selector: 'app-permit',
  imports: [],
  templateUrl: './permit.html',
  styleUrl: './permit.css',
})
export class Permit {
  constructor(private _authService : AuthService) {
    this._authService.changeStatus();
    alert("You are Permitted Now...Relax");
  }
}
