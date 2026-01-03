import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { AuthService } from './auth-service';

export const authGuardGuard: CanActivateFn = (route, state) => {

  let _router = inject(Router)
  let _authService = inject(AuthService)
  let result = _authService.getStatus();
  if (result==false) {
    alert("Redirecting to Error")
  _router.navigate([
  '/menu',
  {
    outlets: {
      virtusa: ['error']
    }
  }
]);


    return false;
  }
  return true;
};
