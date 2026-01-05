import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user';
import { UserService } from '../user-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-search',
  imports: [CommonModule, FormsModule],
  templateUrl: './user-search.html',
  styleUrl: './user-search.css',
})
export class UserSearch {
  user : Observable<User>;
  id : number;
  constructor(private _userService : UserService) {
      this.user = this._userService.getUser(this.id)
  }

  search() {
    this.user = this._userService.getUser(this.id);
  }
}
