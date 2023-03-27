package ss17_io_binary_file.bai_tap.bai_1.controller;

import ss17_io_binary_file.bai_tap.bai_1.service.imp.ProductService;

import java.util.Scanner;

public class MainMenu {
    public static void displayStudent() {
        ProductService productService =new ProductService();
        Scanner scanner = new Scanner(System.in);
         String menu;
        boolean flag;
        do {
            flag = true;
            System.out.println("");
            System.out.print("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1.Thêm mới sản phẩm\n" +
                    "2.Hiển thị sản phẩm\n" +
                    "3.Tìm kiếm sản phẩm\n" +
                    "4.Thoát\n" +
                    "Lựa chọn chức năng: ");
            menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("");
                    System.out.println("Thêm mới sản phẩm");
                    productService.add();
                    break;
                case "2":
                    System.out.println("");
                    System.out.println("Hiển thị sản phẩm");
                    productService.display();
                    break;
                case "3":
                    System.out.println("");
                    System.out.println("Tìm kiếm sản phẩm");
                    productService.search();
                    break;
                case "4":
                    System.out.println("");
                    System.out.println("Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Nhập sai lựa chọn, xin mời nhập lại");
            }
        } while (flag);
    }
}
