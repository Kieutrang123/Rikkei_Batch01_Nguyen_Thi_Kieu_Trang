package rikkeitalent.com.service.reponsitory.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import rikkeitalent.com.service.reponsitory.Entity.Entity.khachhang;
import rikkeitalent.com.service.reponsitory.Entity.service.khachhangservice;

import java.util.List;

@Controller
public class KhachHangController{
    @Autowired
    private khachhangservice hienthi;
    @GetMapping("/trang")
    public String hienThiThongTinkhachhang( Model model) {
        List<khachhang> list = hienthi.listall();
        model.addAttribute("list", list);
        return "table";
    }
    @RequestMapping("/delete/{MaKhachHang}")
    public String xoaKhachHang(@PathVariable(name = "MaKhachHang") String MaKhachHang){
        hienthi.xoa(MaKhachHang);
        return "redirect:/trang";
    }

}
