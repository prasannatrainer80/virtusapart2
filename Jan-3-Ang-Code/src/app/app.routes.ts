import { Routes } from '@angular/router';
import { Home } from './home/home';
import { CustomerLogin } from './customer-login/customer-login';
import { CustomerDashBoard } from './customer-dash-board/customer-dash-board';
import { compatForm } from '@angular/forms/signals/compat';
import { CustomerInfo } from './customer-info/customer-info';
import { CustomerShow } from './customer-show/customer-show';
import { MenuShow } from './menu-show/menu-show';

export const routes: Routes = [
    {path:'',component:Home},
    {path:'customerLogin',component:CustomerLogin},
    {path:'customerDashBoard',component:CustomerDashBoard},
    {path:'customerDashBoard',component:CustomerDashBoard, children : [
        {path:'customerInfo',component:CustomerInfo,outlet:'virtusa'},
        {path:'customerShow',component:CustomerShow,outlet:'virtusa'},
        {path:'menushow',component:MenuShow,outlet:'virtusa'}
    ]}
];
