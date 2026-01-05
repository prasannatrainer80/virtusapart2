import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmploy } from './add-employ';
import { FormsModule, NgForm } from '@angular/forms';
import { EmployService } from '../employ-service';
import { of } from 'rxjs';

describe('EmployAdd Component', () => {
  let fixture: ComponentFixture<AddEmploy>;
  let component: AddEmploy;
  let mockEmployService: any;

  beforeEach(async () => {
    mockEmployService = {
      addEmploy: vi.fn()
    };

    await TestBed.configureTestingModule({
      imports: [AddEmploy, FormsModule], // standalone
      providers: [{ provide: EmployService, useValue: mockEmployService }]
    }).compileComponents();

    fixture = TestBed.createComponent(AddEmploy);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should NOT call service when form is invalid', () => {
    const invalidForm = {
      invalid: true
    } as NgForm;

    component.addEmploy(invalidForm);

    expect(mockEmployService.addEmploy).not.toHaveBeenCalled();
  });

  it('should call service and set result when form is valid', () => {
    const employData = { empno: 100, name: 'Prasanna',gender : 'MALE',
      dept:'Java',desig:'Programmer',basic:82344 };
    const response = { success: true };

    component.employ = employData;

    mockEmployService.addEmploy.mockReturnValue(of(response));

    const validForm = {
      invalid: false
    } as NgForm;

    component.addEmploy(validForm);

    expect(mockEmployService.addEmploy).toHaveBeenCalledWith(employData);
    expect(component.result).toEqual(response);
  });
});
