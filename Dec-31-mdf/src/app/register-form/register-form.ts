import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { validate } from '@angular/forms/signals';
import { OnlyLetters } from '../custom-validator';

@Component({
  selector: 'app-register-form',
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './register-form.html',
  styleUrl: './register-form.css',
})
export class RegisterForm {
 
  isValid : boolean = null;
  registerForm = new FormGroup({
     name : new FormControl('',[Validators.required,Validators.minLength(3),
      Validators.maxLength(10),OnlyLetters]),
     email : new FormControl('',[Validators.required,Validators.email]) 
  })

  submit() {
    // alert(this.isValid);
    this.isValid = false;
    if (this.registerForm.invalid) {
      return;
    }
    this.isValid = true;
  }
}
