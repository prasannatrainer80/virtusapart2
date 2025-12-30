import { Component } from '@angular/core';
import { Employ } from '../employ';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { EmployService } from '../employ-service';

@Component({
  selector: 'app-employ-insert',
  standalone:true,
  imports: [CommonModule,FormsModule],
  templateUrl: './employ-insert.html',
  styleUrl: './employ-insert.css',
})
export class EmployInsert {
  employ : Employ;
  result : string;
  constructor(private _employService : EmployService) {
    this.employ = new Employ();
  }

  addEmploy() {
    this._employService.addEmploy(this.employ).subscribe(x => {
      alert(x);
      this.result = x;
      console.log(this.result);
    })
    alert(this.employ.empno);
  }
}
