import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculation',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calculation.component.html',
  styleUrl: './calculation.component.css'
})
export class CalculationComponent {
  firstNo : number
  secondNo : number
  result : number

  sum() {
    this.result = this.firstNo + this.secondNo
  }

  sub() {
    this.result = this.firstNo - this.secondNo
  }

  mult() {
    this.result = this.firstNo * this.secondNo
  }

  constructor() {

  }
}
