import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-employ-mdf',
  imports: [FormsModule,ReactiveFormsModule,CommonModule],
  templateUrl: './employ-mdf.html',
  styleUrl: './employ-mdf.css',
})
export class EmployMdf {
isValidFormSubmitted: boolean = null;

  employForm = new FormGroup({
  
    empno: new FormControl('', Validators.required),
    name: new FormControl('', Validators.required),
    gender:new FormControl('',Validators.required),
    dept: new FormControl('', Validators.required),
    desig: new FormControl('', Validators.required),
    basic: new FormControl('', Validators.required),
  });

  employSubmit() {
    alert("Hello");
    this.isValidFormSubmitted = false;
    if (this.employForm.invalid) {
      return;
    }
    this.isValidFormSubmitted = true;
  }

}
