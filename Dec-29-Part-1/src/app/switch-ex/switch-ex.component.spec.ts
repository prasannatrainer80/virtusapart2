import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SwitchExComponent } from './switch-ex.component';

describe('SwitchExComponent', () => {
  let component: SwitchExComponent;
  let fixture: ComponentFixture<SwitchExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SwitchExComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SwitchExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
