import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { ButtExComponent } from './butt-ex/butt-ex.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalculationComponent } from './calculation/calculation.component';
import { ConditionComponent } from './condition/condition.component';
import { SwitchExComponent } from './switch-ex/switch-ex.component';
import { EmployShowComponent } from './employ-show/employ-show.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FirstComponent, SecondComponent,ThirdComponent,ButtExComponent,
    TwoWayComponent,CalculationComponent,ConditionComponent,SwitchExComponent,
    EmployShowComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'HelloWorld';
}
