import { describe, it, expect, beforeEach, vi } from 'vitest';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { By } from '@angular/platform-browser';
import { of } from 'rxjs';
import { UserSearch } from './user-search';
import { UserService } from '../user-service';


describe('UserSearch (Standalone + Vitest)', () => {
  let component: UserSearch;
  let fixture: ComponentFixture<UserSearch>;
  let mockUserService: any;

  beforeEach(async () => {
    mockUserService = {
      getUser: vi.fn()
    };

    await TestBed.configureTestingModule({
      imports: [UserSearch, FormsModule], // <-- standalone component goes here
      providers: [{ provide: UserService, useValue: mockUserService }]
    }).compileComponents();

    fixture = TestBed.createComponent(UserSearch);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should display user name and id after clicking Show', async () => {
    const dummyUser = { id: 1, name: 'Prasanna' };
    mockUserService.getUser.mockReturnValue(of(dummyUser));

    // Set the input value
    const inputEl = fixture.debugElement.query(By.css('input[name="id"]')).nativeElement;
    inputEl.value = '1';
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
    expect(compiled.textContent).toContain('User Id :1');

    // Verify service call
    expect(mockUserService.getUser).toHaveBeenCalledWith(1);
  });
});
