package rikkeitalent.com.service.reponsitory.Entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeitalent.com.service.reponsitory.Entity.Entity.khachhang;
import rikkeitalent.com.service.reponsitory.Entity.reponsitory.khachhangreponsitory;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class khachhangservice {
    @Autowired
    private khachhangreponsitory khachhangreponsitory;
    public List<khachhang> listall(){
        return khachhangreponsitory.findAll();
    }
    public void luukh(khachhang kh)
    {
        khachhangreponsitory.save(kh);
    }
    public khachhang xuat(String MaKhachHang)
    {
        return khachhangreponsitory.findById(MaKhachHang).get();
    }
    public void xoa(String MaKhachHang)
    {
        khachhangreponsitory.deleteById(MaKhachHang);
    }
}
