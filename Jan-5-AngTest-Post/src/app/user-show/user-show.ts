import { Component } from '@angular/core';
import { UserService } from '../user-service';
import { Observable } from 'rxjs';
import { User } from '../user';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-show',
  imports: [CommonModule,FormsModule],
  templateUrl: './user-show.html',
  styleUrl: './user-show.css',
})
export class UserShow {

  users : Observable<User[]>
  constructor(private _userService : UserService) {
    this.users = this._userService.getUsers();
  }
}
