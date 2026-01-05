import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserShow } from './user-show';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { UserService } from '../user-service';
import { By } from '@angular/platform-browser';

describe('UserShow', () => {
  // let component: UserShow;
  let fixture: ComponentFixture<UserShow>;
  let httpMock : HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserShow, HttpClientTestingModule],
      providers : [UserService]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserShow);
    httpMock = TestBed.inject(HttpTestingController);
  });

  it('should show the mocked Users ', () => {

    const mockUsers = [
      { id: 1, name: 'Prasanna Pappu', username: 'Prasanna', email: 'Prasanna@example.com' },
      { id: 2, name: 'Lokesh Punwani', username: 'Lokesh', email: 'Lokesh@example.com' },
    ];

    fixture.detectChanges();

     // Expect a GET request to the API
    const req = httpMock.expectOne('https://jsonplaceholder.typicode.com/users');
    expect(req.request.method).toBe('GET');
    req.flush(mockUsers); // Respond with mock data

    fixture.detectChanges();

     // Check if the DOM displays the users
    const liElements = fixture.debugElement.queryAll(By.css('li'));
    expect(liElements.length).toBe(2);
    expect(liElements[0].nativeElement.textContent).toContain('Prasanna');
    expect(liElements[1].nativeElement.textContent).toContain('Lokesh');
  })
  it('should create', () => {
          fixture = TestBed.createComponent(UserShow);
           fixture.detectChanges();
           expect(fixture).toBeTruthy();
  });

});
