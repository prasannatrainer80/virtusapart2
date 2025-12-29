import { NgSwitch, NgSwitchCase, NgSwitchDefault } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-switch-ex',
  standalone: true,
  imports: [FormsModule, NgSwitch, NgSwitchCase, NgSwitchDefault],
  templateUrl: './switch-ex.component.html',
  styleUrl: './switch-ex.component.css'
})
export class SwitchExComponent {
choice : number;

}
