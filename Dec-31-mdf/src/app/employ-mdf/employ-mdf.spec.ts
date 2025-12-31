import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployMdf } from './employ-mdf';

describe('EmployMdf', () => {
  let component: EmployMdf;
  let fixture: ComponentFixture<EmployMdf>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployMdf]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployMdf);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
