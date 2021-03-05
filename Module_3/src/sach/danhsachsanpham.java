package sach;

import java.util.ArrayList;

public class danhsachsanpham {
    ArrayList<sanpham> SANPHAM;

    public danhsachsanpham(){
        SANPHAM = new ArrayList<>();
    }

    public ArrayList<sanpham> getSANPHAM() {
        return SANPHAM;
    }

    public void setSANPHAM(ArrayList<sanpham> SANPHAM) {
        this.SANPHAM = SANPHAM;
    }
    public void themSanPham( sanpham spham){
        this.SANPHAM.add(spham);
    }

    public void xoaSanPham(sanpham spham){
        this.SANPHAM.remove(spham);
    }
}
