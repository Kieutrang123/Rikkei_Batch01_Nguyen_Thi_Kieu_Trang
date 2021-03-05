package sach;

import sun.security.rsa.RSAUtil;

import javax.print.DocFlavor;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class dungcuht extends sanpham {
    public String xuatxu;
    public String thuonghieu;
    public String nhacc;
    public String huongdansd;
    public String mausac;
    public String chatlieu;
    public String kichthuoc;
ArrayList<dungcuht> listdungcu=new ArrayList<>();
    @Override
    public String toString() {
        return "dungcuht{" +
                "xuatxu='" + xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", huongdansd='" + huongdansd + '\'' +
                ", mausac='" + mausac + '\'' +
                ", chatlieu='" + chatlieu + '\'' +
                ", kichthuoc='" + kichthuoc + '\'' +
                '}';
    }

    @Override
    public void hienthisp() {
        System.out.println(listdungcu);
    }

    @Override
    public double phantramgiamgia(String loaikh) {
        if(loaikh.equals("thuong")) return 0.01;
        else if(loaikh.equals("VIP1")) return 0.03;
        else if (loaikh.equals("VIP2")) return 0.7;
        else return 0;
    }

    public dungcuht(){

    }

    public dungcuht(String masanpham, String tensanpham, int soluong, float dongia, String thuocdanhmuc, String xuatxu, String thuonghieu, String nhacc, String huongdansd, String mausac, String chatlieu, String kichthuoc) {
        super(masanpham, tensanpham, soluong, dongia, thuocdanhmuc);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.huongdansd = huongdansd;
        this.mausac = mausac;
        this.chatlieu = chatlieu;
        this.kichthuoc = kichthuoc;
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

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
    public void nhapdungcu(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Nhập dụng cụ học tập --------");
        System.out.println("Xuất xứ");
        xuatxu = sc.nextLine();
        System.out.println("Thương hiệu");
        thuonghieu = sc.nextLine();
        System.out.println("Nhà cung cấp");
        nhacc =sc.nextLine();
        System.out.println("Hướng dẫn sử dụng");
        huongdansd= sc.nextLine();
        System.out.println("Màu sắc");
        mausac= sc.nextLine();
        System.out.println("Chất liệu");
        chatlieu= sc.nextLine();
        System.out.println("Kích thước");
        kichthuoc= sc.nextLine();
        dungcuht Dungcu= new dungcuht(masanpham,tensanpham,soluong,dongia,thuocdanhmuc,xuatxu,thuonghieu,nhacc,huongdansd,mausac,chatlieu,kichthuoc);
        listdungcu.add(Dungcu);
    }
        public void Themdungcu(){
        final String Filedungcu="src/CSV/dodunghoctap.csv";
        dungcuht dungcuhoc = new dungcuht();
        dungcuhoc.nhapdungcu();
        dungcuhoc.hienthisp();
        FileIUls file = new FileIUls();
        for (dungcuht item: dungcuhoc.listdungcu)
                file.writeFile(Filedungcu,item.toString());
        }
}
