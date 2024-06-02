import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BenutzerComponent } from './benutzer.component';

describe('BenutzerComponent', () => {
  let component: BenutzerComponent;
  let fixture: ComponentFixture<BenutzerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BenutzerComponent]
    });
    fixture = TestBed.createComponent(BenutzerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
