import { Component } from '@angular/core';

@Component({
  selector: 'app-third',
  standalone: true,
  imports: [],
  templateUrl: './third.component.html',
  styleUrl: './third.component.css'
})
export class ThirdComponent {
  topic : string;
  batch : string;
  company : string;

  constructor() {
    this.topic = "Angular 18" 
    this.batch = "Batch 3"
    this.company = "Virtusa"
  }
}
