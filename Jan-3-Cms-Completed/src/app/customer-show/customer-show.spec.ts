import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerShow } from './customer-show';

describe('CustomerShow', () => {
  let component: CustomerShow;
  let fixture: ComponentFixture<CustomerShow>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomerShow]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomerShow);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
