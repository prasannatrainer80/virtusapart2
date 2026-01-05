import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Employ } from '../employ';
import { EmployService } from '../employ-service';

@Component({
  selector: 'app-add-employ',
  imports: [CommonModule,FormsModule],
  templateUrl: './add-employ.html',
  styleUrl: './add-employ.css',
})
export class AddEmploy {
employ : Employ;
  result : string;
  isValid : boolean;
  constructor(private _employService : EmployService) {
    this.employ = new Employ();
    this.isValid = false;
  }

  addEmploy(employForm : NgForm) {
    if (employForm.invalid) {
      return;
    }
    this._employService.addEmploy(this.employ).subscribe(x => {
     
      this.result = x;
      console.log(this.result);
    })

  }
}
