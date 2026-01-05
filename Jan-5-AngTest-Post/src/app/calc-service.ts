import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class CalcService {
    
    sum(a : number , b : number) : number {
      return a + b;
    }

    sub(a : number , b : number) : number {
      return a - b;
    }

    mult(a : number , b : number) : number {
      return a * b;
    }
}
