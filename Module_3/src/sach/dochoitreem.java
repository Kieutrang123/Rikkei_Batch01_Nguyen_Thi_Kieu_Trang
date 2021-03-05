package sach;

import java.util.ArrayList;
import java.util.Scanner;

public class  dochoitreem extends sanpham {
    public String xuatxu;
    public String thuonghieu;
    public String nhacc;
    public String huongdansd;
ArrayList<dochoitreem> listdochoi = new ArrayList<>();
    @Override
    public String toString() {
        return "dochoitreem{" +
                "xuatxu='" + xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", huongdansd='" + huongdansd + '\'' +
                '}';
    }

    @Override
    public void hienthisp() {

        System.out.println(listdochoi);
    }

    @Override
    public double phantramgiamgia(String loaikh) {
        if(loaikh.equals("thuong")) return 0.02;
        else if(loaikh.equals("VIP1")) return 0.05;
        else if (loaikh.equals("VIP2")) return 0.7;
        else return 0;
    }

    public dochoitreem(){

    }

    public dochoitreem(String masanpham, String tensanpham, int soluong, float dongia, String thuocdanhmuc, String xuatxu, String thuonghieu, String nhacc, String huongdansd) {
        super(masanpham, tensanpham, soluong, dongia, thuocdanhmuc);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.huongdansd = huongdansd;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getNhacc() {
        return nhacc;
    }

    public void setNhacc(String nhacc) {
        this.nhacc = nhacc;
    }

    public String getHuongdansd() {
        return huongdansd;
    }

    public void setHuongdansd(String huongdansd) {
        this.huongdansd = huongdansd;
    }
    public void nhapdochoi(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Xuất xứ");
        xuatxu= sc.nextLine();
        System.out.println("Thương hiệu");
        thuonghieu= sc.nextLine();
        System.out.println("Nhà cung cấp");
        nhacc= sc.nextLine();
        System.out.println("Hướng dẫn sử dụng");
        huongdansd= sc.nextLine();
        dochoitreem toy =new dochoitreem(masanpham,tensanpham,soluong,dongia,thuocdanhmuc,xuatxu,thuonghieu,nhacc,huongdansd);
        listdochoi.add(toy);
    }
    public void ThemDoChoi(){
        final String Filedochoi = "src/CSV/dochoitreem.csv";
        dochoitreem dochoitre =new dochoitreem();
        dochoitre.nhapdochoi();
        dochoitre.hienthisp();
        FileIUls file = new FileIUls();
        for (dochoitreem item:dochoitre.listdochoi)
            file.writeFile(Filedochoi,item.toString());
    }
}
