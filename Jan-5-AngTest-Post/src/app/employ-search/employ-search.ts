import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { EmployService } from '../employ-service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-search',
  imports: [CommonModule,FormsModule],
  templateUrl: './employ-search.html',
  styleUrl: './employ-search.css',
})
export class EmploySearch {
  empno :number;
  employ : Observable<Employ>;
  search() {
    this.employ = this._employService.searchEmploy(this.empno);
  }
  constructor(private _employService : EmployService) {

  }
}
