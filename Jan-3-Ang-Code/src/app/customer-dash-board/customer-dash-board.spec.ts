import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerDashBoard } from './customer-dash-board';

describe('CustomerDashBoard', () => {
  let component: CustomerDashBoard;
  let fixture: ComponentFixture<CustomerDashBoard>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomerDashBoard]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomerDashBoard);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
