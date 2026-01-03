import { Routes } from '@angular/router';
import { Menu } from './menu/menu';
import { Home } from './home/home';
import { About } from './about/about';
import { Info } from './info/info';
import { ErrorComponent } from './error-component/error-component';
import { authGuardGuard } from './auth-guard-guard';
import { Permit } from './permit/permit';
import { Login } from './login/login';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'menu',
    pathMatch: 'full'
  },
  {
    path: 'menu',
    component: Menu, 
    children: [
      { path: 'home', component: Home, canActivate:[authGuardGuard],  outlet: 'virtusa' },
      { path: 'about', component: About, outlet: 'virtusa' },
      { path: 'info', component: Info, outlet: 'virtusa' },
      { path:'permit',component:Permit,outlet:'virtusa'},
      { path:'login',component:Login,outlet:'virtusa'},
      { path: 'error', component: ErrorComponent, outlet: 'virtusa' }
    ]
  }
];