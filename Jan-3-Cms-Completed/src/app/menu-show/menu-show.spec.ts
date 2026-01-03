import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuShow } from './menu-show';

describe('MenuShow', () => {
  let component: MenuShow;
  let fixture: ComponentFixture<MenuShow>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MenuShow]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuShow);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
