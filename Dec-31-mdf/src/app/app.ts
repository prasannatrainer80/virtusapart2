import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployTdf } from './employ-tdf/employ-tdf';
import { LoginForm } from './login-form/login-form';
import { EmployMdf } from './employ-mdf/employ-mdf';
import { EmployMdfNew } from './employ-mdf-new/employ-mdf-new';
import { RegisterForm } from './register-form/register-form';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,EmployTdf,LoginForm,EmployMdfNew,RegisterForm],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('FormsDemo');
}
