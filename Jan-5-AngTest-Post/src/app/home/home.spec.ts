import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Home } from './home';
import { AuthService } from '../auth-service';
import { By } from '@angular/platform-browser';


describe('Home', () => {
   let fixture : ComponentFixture<Home>;
   let authServiceMock : {isAuthenticated : ReturnType<typeof vi.fn>};

   beforeEach(() => {
    authServiceMock = {isAuthenticated : vi.fn()};
    TestBed.configureTestingModule({
      imports : [
        Home
      ],
      providers : [
         { provide: AuthService, useValue: authServiceMock }
      ]
    });
   });
   
   it('Component to be Loaded Mandetory', () => {
        fixture = TestBed.createComponent(Home);
        fixture.detectChanges();
        expect(fixture).toBeTruthy();
   })

it('Component to Check value or `Lokesh`  ', () => {
        fixture = TestBed.createComponent(Home);
        const x = fixture.componentInstance;
        expect(x.name).toBe('Lokesh')
        fixture.detectChanges();
       
   })

it('Component to Check `emp` Object Values ', () => {
        fixture = TestBed.createComponent(Home);
        fixture.detectChanges(); // ✅ triggers ngOnInit
        const x = fixture.componentInstance;
        expect(x.emp.empno).toEqual(1)
        expect(x.emp.name).toEqual('Raj')
        expect(x.emp.salary).toEqual(84423)
        // expect(x.name).toBe('Lokesh')
        fixture.detectChanges();
       
   })
it('You need to Login First... ', () => {
      authServiceMock.isAuthenticated.mockReturnValue(false) 
      fixture = TestBed.createComponent(Home);
      fixture.detectChanges()

      const h2 = fixture.debugElement.query(By.css('h2')).nativeElement;
      expect(h2.textContent).toBe('Please Login');
   })

   it('Compnent Should Print Message `Welcome User` ', () => {
      authServiceMock.isAuthenticated.mockReturnValue(true) 
      fixture = TestBed.createComponent(Home);
      fixture.detectChanges()

      const h2 = fixture.debugElement.query(By.css('h2')).nativeElement;
    expect(h2.textContent).toBe('Welcome User');
   })
  // let component: Home;
  // let fixture: ComponentFixture<Home>;

  // beforeEach(async () => {
  //   await TestBed.configureTestingModule({
  //     imports: [Home]
  //   })
  //   .compileComponents();

  //   fixture = TestBed.createComponent(Home);
  //   component = fixture.componentInstance;
  //   await fixture.whenStable();
  // });

  // it('should create', () => {
  //   expect(component).toBeTruthy();
  // });
});
