import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ButtExComponent } from './butt-ex.component';

describe('ButtExComponent', () => {
  let component: ButtExComponent;
  let fixture: ComponentFixture<ButtExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ButtExComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ButtExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
