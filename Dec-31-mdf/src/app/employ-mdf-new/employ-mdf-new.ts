import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-employ-mdf-new',
  standalone:true,
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './employ-mdf-new.html',
  styleUrl: './employ-mdf-new.css',
})
export class EmployMdfNew {
  constructor(private fb : FormBuilder) {}
  isValid : boolean = null;
  employForm = new FormGroup({
    empno : new FormControl('',Validators.required),
    name : new FormControl('',Validators.required),
    gender : new FormControl('',Validators.required),
    dept : new FormControl('',Validators.required),
    desig : new FormControl('',Validators.required),
    basic : new FormControl('',Validators.required)
  })
  
  addEmploy() {
    this.isValid = false;
     alert(this.employForm.valid)
    if (this.employForm.invalid) {
      return;
    }
    alert(this.employForm.valid)
  }
 
}
