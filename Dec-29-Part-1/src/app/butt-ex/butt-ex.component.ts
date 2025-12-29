import { Component } from '@angular/core';

@Component({
  selector: 'app-butt-ex',
  standalone: true,
  imports: [],
  templateUrl: './butt-ex.component.html',
  styleUrl: './butt-ex.component.css'
})
export class ButtExComponent {
  lokesh() {
    // alert("Hi I am Lokesh...");
    this.result = "Hi I am Lokesh..."
  }

  meghana() {
    // alert("Hi I am Meghana...");
    this.result = "Hi I a Meghana..."
  }

  akshitha() {
    // alert("Hi I am Akshitha...");
    this.result = "Hi I am Akshitha..."
  }

  result : string;
}
