package sach;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tthoadon  {
    public String mahd;
    public String makh;
    public String masp;
    public int soluong;
    public Date ngaymua;
    public float dongia;
    public float tongtien;

    @Override
    public String toString() {
        return "tthoadon{" +
                "mahd='" + mahd + '\'' +
                ", makh='" + makh + '\'' +
                ", masp='" + masp + '\'' +
                ", soluong=" + soluong +
                ", ngaymua=" + ngaymua +
                ", dongia=" + dongia +
                ", tongtien=" + tongtien +
                '}';
    }



    public tthoadon(){

    }

    public tthoadon(String mahd, String makh, String masp, int soluong, Date ngaymua, float dongia, float tongtien) {
        this.mahd = mahd;
        this.makh = makh;
        this.masp = masp;
        this.soluong = soluong;
        this.ngaymua = ngaymua;
        this.dongia = dongia;
        this.tongtien = tongtien;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }
    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }
    public void nhaphd(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Mã hóa đơn");
        mahd= sc.nextLine();
        System.out.println("Mã khách hàng");
        makh= sc.nextLine();
        System.out.println("Mã sản phẩm");
        masp= sc.nextLine();
        System.out.println("Số lượng");
        soluong = sc.nextInt();
        System.out.println("Ngày mua");
        String ngaymuahang = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        try {
                ngaymua = formatter.parse(ngaymuahang);
        }catch (Exception e)
        {
        }
        System.out.println("Đơn giá");
        dongia=Float.parseFloat(sc.nextLine());
        System.out.println("Tổng tiền");
        tongtien = Float.parseFloat(sc.nextLine());
    }
}
