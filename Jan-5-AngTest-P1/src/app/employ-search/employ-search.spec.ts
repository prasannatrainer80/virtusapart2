import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmploySearch } from './employ-search';
import { FormsModule } from '@angular/forms';
import { EmployService } from '../employ-service';
import { of } from 'rxjs';
import { By } from '@angular/platform-browser';

describe('EmploySearch', () => {
  let component: EmploySearch;
  let fixture: ComponentFixture<EmploySearch>;
  let mockEmployService: any;
  beforeEach(async () => {

    mockEmployService = {
      searchEmploy: vi.fn()
    };
    await TestBed.configureTestingModule({
      imports: [EmploySearch,FormsModule],
       providers: [{ provide: EmployService, useValue: mockEmployService }]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmploySearch);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

it('should display Employ Details after clicking Show', async () => {
  const dummyEmploy = {
    empno: 100,
    name: 'Prasanna',
    gender: 'MALE',
    dept: 'Java',
    desig: 'Manager',
    basic: 8423
  };

  mockEmployService.searchEmploy.mockReturnValue(of(dummyEmploy));

  // Set the input value
  const inputEl = fixture.debugElement.query(By.css('input[name="empno"]')).nativeElement;
  inputEl.value = '100';
  inputEl.dispatchEvent(new Event('input'));
  fixture.detectChanges();

  // Click the Show button
  const buttonEl = fixture.debugElement.query(By.css('input[type="button"]')).nativeElement;
  buttonEl.click();

  // Wait for async pipe to render
  await fixture.whenStable();
  fixture.detectChanges();

  // Verify DOM
  const nameEl = fixture.debugElement.query(By.css('h3')).nativeElement;
  expect(nameEl.textContent).toContain('Prasanna');

  const compiled = fixture.nativeElement;
  expect(compiled.textContent).toContain('Employ No :100');

  // ✅ Correct assertion
  expect(mockEmployService.searchEmploy).toHaveBeenCalledWith(100);
});

  

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
