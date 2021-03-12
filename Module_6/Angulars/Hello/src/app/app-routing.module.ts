import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {KhachHangComponent} from './khach-hang/khach-hang.component';
import {NhanvienComponent} from './nhanvien/nhanvien.component';
import {ListNhanvienComponent} from './list-nhanvien/list-nhanvien.component';
import {SanphamComponent} from './sanpham/sanpham.component';

const routes: Routes = [
  {path: 'khachhang', component: KhachHangComponent},
  {path: 'nhanvien', component: NhanvienComponent},
  {path: 'listnhanvien', component: ListNhanvienComponent},
  {path: 'addsach', component: SanphamComponent},
  {path: '', redirectTo: '/khachhang', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
