import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListNhanvienComponent } from './list-nhanvien/list-nhanvien.component';
import {FormsModule} from "@angular/forms";
import { KhachHangComponent } from './khach-hang/khach-hang.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { NhanvienComponent } from './nhanvien/nhanvien.component';
import { SanphamComponent } from './sanpham/sanpham.component';

@NgModule({
  declarations: [
    AppComponent,
    ListNhanvienComponent,
    KhachHangComponent,
    FooterComponent,
    HeaderComponent,
    NhanvienComponent,
    SanphamComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
