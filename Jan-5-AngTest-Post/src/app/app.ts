import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserShow } from './user-show/user-show';
import { UserSearch } from './user-search/user-search';
import { EmployShow } from './employ-show/employ-show';
import { EmploySearch } from './employ-search/employ-search';
import { AddEmploy } from './add-employ/add-employ';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,UserShow,UserSearch,EmployShow,EmploySearch,AddEmploy],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('AngTest18New');
  protected readonly company = "Virtusa"
  protected readonly topic = "JavaFsd"
}
