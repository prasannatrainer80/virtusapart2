import { TestBed } from '@angular/core/testing';

import { CalcService } from './calc-service';

describe('CalcService', () => {
  let service: CalcService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CalcService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

    it('should return correct value for sum', () => {
      expect(service.sum(12,5)).toEqual(17);
    })

  it('should return correct value for sub', () => {
    expect(service.sub(12,5)).toEqual(7);
  })

  it('should return correct value for mult', () => {
    expect(service.mult(12,5)).toEqual(60);
  })
});
