import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployShow } from './employ-show';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { EmployService } from '../employ-service';
import { By } from '@angular/platform-browser';

describe('EmployShow', () => {
  let component: EmployShow;
  let fixture: ComponentFixture<EmployShow>;
  let httpMock : HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployShow,HttpClientTestingModule],
      providers : [EmployService]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployShow);
     httpMock = TestBed.inject(HttpTestingController);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

    it('should show the mocked Employs ', () => {

    const mockEmploys = [
      { empno: 1, name: 'Prasanna Pappu', gender: 'MALE',
        dept : 'Java',desig : 'Manager',basic : 84355 },
        { empno: 2, name: 'Shaili Sunku', gender: 'FEMALE',
        dept : 'Java',desig : 'Manager',basic : 90000 },
    ];

    fixture.detectChanges();

     // Expect a GET request to the API
    const req = httpMock.expectOne('http://localhost:9000/showEmploy');
    expect(req.request.method).toBe('GET');
    req.flush(mockEmploys); // Respond with mock data

    fixture.detectChanges();

    // ✅ CORRECT selector
    const rows = fixture.debugElement.queryAll(By.css('table tr'));

    expect(rows.length).toBe(3);

    const firstRowText = rows[1].nativeElement.textContent;
    expect(firstRowText).toContain('Prasanna');

    const secondRowText = rows[2].nativeElement.textContent;
    expect(secondRowText).toContain('Shaili');
  })


  it('should create', () => {
    expect(component).toBeTruthy();
  });


});
