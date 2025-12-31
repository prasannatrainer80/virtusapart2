import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployMdfNew } from './employ-mdf-new';

describe('EmployMdfNew', () => {
  let component: EmployMdfNew;
  let fixture: ComponentFixture<EmployMdfNew>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployMdfNew]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployMdfNew);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
