import { NgIf } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-condition',
  standalone: true,
  imports: [FormsModule, NgIf],
  templateUrl: './condition.component.html',
  styleUrl: './condition.component.css'
})
export class ConditionComponent {
  status : boolean;
  constructor() {
    this.status = true;
  }
}
