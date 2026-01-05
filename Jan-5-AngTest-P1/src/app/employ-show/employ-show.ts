import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from '../employ';
import { EmployService } from '../employ-service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-employ-show',
  imports: [FormsModule, CommonModule],
  templateUrl: './employ-show.html',
  styleUrl: './employ-show.css',
})
export class EmployShow {
  employs : Observable<Employ[]>;

  constructor(private _employService : EmployService) {
    this.employs = this._employService.showEmploy();
  }
}
