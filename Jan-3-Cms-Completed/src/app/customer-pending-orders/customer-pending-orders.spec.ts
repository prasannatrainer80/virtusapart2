import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerPendingOrders } from './customer-pending-orders';

describe('CustomerPendingOrders', () => {
  let component: CustomerPendingOrders;
  let fixture: ComponentFixture<CustomerPendingOrders>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomerPendingOrders]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomerPendingOrders);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
