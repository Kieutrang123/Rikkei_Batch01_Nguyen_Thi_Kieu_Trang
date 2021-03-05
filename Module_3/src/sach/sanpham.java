package sach;

import java.util.Scanner;

public abstract class sanpham {

    protected String masanpham;
    protected String tensanpham;
    protected int soluong;
    protected float dongia;
    protected String thuocdanhmuc;
    //protected abstract void hienthidonhang();
    public abstract void hienthisp();
    public abstract double phantramgiamgia(String loaikh);
    @Override
    public String toString() {
        return "sanpham{" +
                "masanpham='" + masanpham + '\'' +
                ", tensanpham='" + tensanpham + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                ", thuocdanhmuc='" + thuocdanhmuc + '\'' +
                '}';
    }

    public sanpham(){

    }

    public sanpham(String masanpham, String tensanpham, int soluong, float dongia, String thuocdanhmuc) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thuocdanhmuc = thuocdanhmuc;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getThuocdanhmuc() {
        return thuocdanhmuc;
    }

    public void setThuocdanhmuc(String thuocdanhmuc) {
        this.thuocdanhmuc = thuocdanhmuc;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sản phẩm");
        masanpham=sc.nextLine();
        System.out.println("Tên sản phẩm");
        tensanpham = sc.nextLine();
        System.out.println("Số lượng");
        soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Đơn giá");
        dongia = Float.parseFloat(sc.nextLine());
        System.out.println("Thuộc danh mục");
        thuocdanhmuc = sc.nextLine();
    }
}
