package sach;

import java.util.Scanner;

public class MainMenuControll {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        boolean a = true;

            System.out.println("Chọn chức năng");
            System.out.println("1.Thêm sản phẩm ");
            System.out.println("2.Thêm đơn hàng");
            System.out.println("3.Hiển thị thông tin sản phẩm");
            System.out.println("4.Hiển thị danh sách đơn hàng");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Thoát");
            int chon= input.nextInt();
            switch (chon){
                case 1:
                    System.out.println("Chức năng thêm sản phẩm");
                    System.out.println("1.Thêm sản phẩm sách");
                    System.out.println("2.Thêm sản phẩm đồ dùng học tập");
                    System.out.println("3.Thêm sản phẩm đồ chơi trẻ em");
                    int chonsp= input.nextInt();
                        switch (chonsp) {
                            case 1:
                                System.out.println("--------Sản phẩm cần thêm-------");

                                System.out.println("Thêm sản phẩm sách");
                                Sach spsach = new Sach();
                                spsach.ThemSach();

                                break;
                            case 2:
                                System.out.println(" Thêm sản phẩm đồ dùng học tập ");
                                dungcuht sphoctap = new dungcuht();
                                sphoctap.Themdungcu();
                                break;
                            case 3:
                                System.out.println("Thêm sản phẩm đồ chơi trẻ em");
                                dochoitreem spdochoi = new dochoitreem();
                                spdochoi.ThemDoChoi();
                                break;
                        }
                /*case 2:
                System.out.println("TÌM KIẾM");
                System.out.println("1.Tìm kiếm theo mã sản phẩm");
                System.out.println("2.Tìm kiếm theo tên sản phẩm");
                System.out.println("3.Thoát");
                int tim  = input.nextInt();
                switch (tim){
                    case 1:
                        System.out.println("Tìm kiếm theo mã sản phẩm");
                        sanpham.
                }*/
            }
            }

            }




