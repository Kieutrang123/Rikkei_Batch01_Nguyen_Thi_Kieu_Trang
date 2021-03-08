

create table if not exists DanhMucSach(
madm int,
theloai varchar(255),
mota varchar(1000),
primary key (madm)
);
create table if not exists 	dmdochoi(
madmdochoi int,
nhom varchar (200),
mota varchar (1000),
primary key (madmdochoi)
);


create table if not exists dmdungcu(
madmdungcu int,
khoi varchar (200),
mota varchar(1000),
primary key (madmdungcu)
);

create table if not exists sanphamsach(
maspsach int,
tenspsach varchar (250),
soluong int,
dongia int,
donvi varchar(50),
madm int,
nhaxuatban varchar (200),
namxuatban int,
tacgia varchar (200),
ngayxuatban date,
lantaiban int,
primary key (maspsach),
foreign key (madm) references DanhMucSach(madm)
);

create table if not exists sanphamdochoi (
maspdochoi int,
tenspdochoi varchar (200),
soluong int,
dongia int,
donvi varchar (50),
madmdochoi int,
xuatxu varchar (500),
thuonghieu varchar (200),
nhacungcap varchar (200),
huongdan varchar (1000),
primary key (maspdochoi),
foreign key (madmdochoi) references dmdochoi (madmdochoi)
);

create table if not exists sanphamdungcu (
maspdungcu int,
tenspdungcu varchar (200),
soluong int,
dongia int,
donvi varchar (50),
madmdungcu int,
xuatxu varchar (500),
thuonghieu varchar (200),
nhacungcap varchar (200),
mausac varchar (100),
kichthuoc varchar (100),
chatlieu varchar (100),
huongdan varchar (1000),
primary key (maspdungcu),
foreign key (maspdungcu) references dmdungcu(madmdungcu)
);

create table if not exists nhanvien (
manhanvien int,
tennhanvien varchar (200),
ngaysinh date,
vitri varchar (200),
sodienthoai int (11),
email varchar (50),
diachi varchar (500),
primary key (manhanvien)
); 

create table if not exists loaikhachhang (
maloai int,
tenloai nvarchar (200),
primary key (maloai)
);

create table if not exists khachhang (
makhachhang int,
tenkhachhang varchar (200),
email varchar (50),
sodienthoai int,
ngaysinh date,
maloai int,
primary key (makhachhang),
foreign key (maloai) references loaikhachhang(maloai)
);

create table if not exists donhang (
madonhang int,
makhachhang int,
manhanvien int,
ngaymuahang date,
tongtien int,
primary key (madonhang),
foreign key (manhanvien) references nhanvien(manhanvien),
foreign key (makhachhang) references khachhang(makhachhang)
);

create table if not exists chitietdonhang (
madonhang int,
masanpham int,
soluong int,
foreign key (madonhang) references donhang(madonhang),
foreign key (masanpham) references sanphamsach(maspsach),
foreign key (masanpham) references sanphamdochoi (maspdochoi),
foreign key (masanpham) references sanphamdungcu (maspdungcu)
);