import { Component, OnInit } from '@angular/core';
export  interface Inhanvien {
  id: number;
  ten: string;
  sdt: string;
  diem: number;
  image: string;

}

@Component({
  selector: 'app-list-nhanvien',
  templateUrl: './list-nhanvien.component.html',
  styleUrls: ['./list-nhanvien.component.scss']
})
export class ListNhanvienComponent implements OnInit {
  nhanvien: Inhanvien = {
    id: 1,
    ten: 'Nguyen Van A',
    sdt: '12312323123',
    diem: 1,
    image: 'https://scontent.fsgn2-4.fna.fbcdn.net/v/t1.0-9/132192327_2886705728219822_3305635144100167036_o.jpg?_nc_cat=101&ccb=1-3&_nc_sid=a4a2d7&_nc_ohc=-ATYGG0_tq0AX9JuWB1&_nc_ht=scontent.fsgn2-4.fna&oh=8547a37300e998d242313a72f89e2311&oe=6070776E'
};
  constructor() { }

  ngOnInit(): void {
  }
}
