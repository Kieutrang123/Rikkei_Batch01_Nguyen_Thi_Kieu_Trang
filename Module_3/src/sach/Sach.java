package sach;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sach extends sanpham{

        public String nhaxb;
        public int namxb;
        public String tacgia;
        public Date ngayxb;
        public int lantaiban;

        @Override
        public String toString() {
                return "Sach{" +
                        "nhaxb='" + nhaxb + '\'' +
                        ", namxb=" + namxb +
                        ", tacgia='" + tacgia + '\'' +
                        ", ngayxb=" + ngayxb +
                        ", lantaiban=" + lantaiban +
                        ", masanpham='" + masanpham + '\'' +
                        ", tensanpham='" + tensanpham + '\'' +
                        ", soluong=" + soluong +
                        ", dongia=" + dongia +
                        ", thuocdanhmuc='" + thuocdanhmuc + '\'' +
                        '}';
        }

        ArrayList<Sach> listsach= new ArrayList<>();
        public Sach(String masanpham, String tensanpham, int soluong, float dongia, String thuocdanhmuc, String nhaxb, int namxb, String tacgia, Date ngayxb, int lantaiban) {
                super(masanpham, tensanpham, soluong, dongia, thuocdanhmuc);
                this.nhaxb = nhaxb;
                this.namxb = namxb;
                this.tacgia = tacgia;
                this.ngayxb = ngayxb;
                this.lantaiban = lantaiban;
        }

        @Override
        public void hienthisp() {
                System.out.println(listsach);
        }


        @Override
        public double  phantramgiamgia(String loaikh) {
                if(loaikh.equals("thuong")) return 0.02;
                else if(loaikh.equals("VIP1")) return 0.05;
                else if (loaikh.equals("VIP2")) return 0.1;
                else return 0;
        }

        public Sach(){

        }

        public String getNhaxb() {
                return nhaxb;
        }

        public void setNhaxb(String nhaxb) {
                this.nhaxb = nhaxb;
        }

        public int getNamxb() {
                return namxb;
        }

        public void setNamxb(int namxb) {
                this.namxb = namxb;
        }

        public String getTacgia() {
                return tacgia;
        }

        public void setTacgia(String tacgia) {
                this.tacgia = tacgia;
        }

        public Date getNgayxb() {
                return ngayxb;
        }

        public void setNgayxb(Date ngayxb) {
                this.ngayxb = ngayxb;
        }

        public int getLantaiban() {
                return lantaiban;
        }

        public void setLantaiban(int lantaiban) {
                this.lantaiban = lantaiban;
        }
        public void nhapsach(){
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.println("----------NHẬP SÁCH---------");
                System.out.println("Nhà xuất bản ");
                nhaxb= sc.nextLine();
                do {
                        System.out.println("Năm xuất bản");
                        namxb = Integer.parseInt(sc.nextLine());
                        if(namxb<1000|| namxb>2021)
                                System.out.println("sai nam");
                }while (namxb<1000 || namxb>2021);
                System.out.println("Tác giả");
                tacgia=sc.nextLine();

                Date date = new Date();
                while (true) {
                        SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                                System.out.println("Ngày xuất bản");
                                String ngayxuatban = sc.nextLine();
                                ngayxb = formatt.parse(ngayxuatban);
                                break;
                        } catch (Exception e) {
                                System.out.println("Dinh dang sai");
                        }
                }
                do{
                System.out.println("Lần tái bản");

                lantaiban=Integer.parseInt(sc.nextLine());
                if(lantaiban<0)
                        System.out.println("phai la so nguyen duong");
                }while (lantaiban<0);

                Sach sachlist=new Sach(masanpham,tensanpham,soluong,dongia,thuocdanhmuc,nhaxb,namxb,tacgia,ngayxb,lantaiban);
                listsach.add(sachlist);
        }
        public void ThemSach(){
                final String FileSach="src/CSV/sach.csv";
                Sach sach = new Sach();
                sach.nhapsach();
                sach.hienthisp();
                FileIUls file = new FileIUls();
                for (Sach item : sach.listsach)
                        file.writeFile(FileSach, item.toString());
        }
}
