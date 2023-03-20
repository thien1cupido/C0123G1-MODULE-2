package ss12_map_tree.bai_tap.bai_1.controller;

import ss12_map_tree.bai_tap.bai_1.service.imp.ServiceProduct;

import java.util.Scanner;

public class MainProduct {
    public static void display() {

        boolean flag;
        do {
            flag = true;
            Scanner scanner = new Scanner(System.in);
            ServiceProduct serviceProduct=new ServiceProduct();
            System.out.println("");
            System.out.println("Lựa chọn chức năng:\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Hiện danh sách sản phẩm\n" +
                    "3.Sửa sản phẩm\n" +
                    "4.Xóa sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm\n" +
                    "6.Sắp xếp sản phẩm\n" +
                    "7.Thoát\n");
            System.out.print("Nhập lựa chọn: ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("");
                    serviceProduct.add();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Danh sách sản phẩm");
                    serviceProduct.display();
                    break;
                case 3:
                    System.out.println("");
                    serviceProduct.update();
                    break;
                case 4:
                    serviceProduct.display();
                    System.out.println("");
                    serviceProduct.delect();
                    break;
                case 5:
                    System.out.println("");
                    serviceProduct.search();
                    break;
                case 6:
                    System.out.println();
                    serviceProduct.sort();
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

}
