package lam_them.controller;

import lam_them.service.imp.InstructorService;
import lam_them.service.imp.StudentService;

import java.util.Scanner;

public class MainMenu {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn dashboard 'học sinh' hoặc 'giảng viên':\n" +
                    "1.Học sinh\n" +
                    "2.Giảng viên\n" +
                    "3.Thoát\n" +
                    "Nhập lựa chọn: ");
            menu = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (menu) {
                case 1:
                    System.out.println("Học sinh");
                    MainMenu.displayStudent();
                    break;
                case 2:
                    System.out.println("Giảng viên");
                    MainMenu.displayInstructor();
                    break;
                case 3:
                    System.out.println("Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

    public static void displayStudent() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean flag;
        do {
            flag = true;
            System.out.println("");
            System.out.print("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1.Thêm mới học sinh\n" +
                    "2.Xóa học sinh\n" +
                    "3.Xem danh sách học sinh\n" +
                    "4.Thoát\n" +
                    "Lựa chọn chức năng: ");
            menu = Integer.parseInt(scanner.nextLine());
            StudentService studentService = new StudentService();
            switch (menu) {
                case 1:
                    System.out.println("");
                    System.out.println("Thêm mới");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Xóa thông tin");
                    studentService.delect();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Hiển thị danh sách");
                    studentService.display();
                    break;
                case 4:
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

    public static void displayInstructor() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean flag;
        do {
            flag = true;
            System.out.println("");
            System.out.print("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1.Thêm mới giảng viên \n" +
                    "2.Xóa giảng viên\n" +
                    "3.Xem danh sách giảng viên\n" +
                    "4.Thoát\n" +
                    "Lựa chọn chức năng: ");
            menu = Integer.parseInt(scanner.nextLine());
            InstructorService instructorService = new InstructorService();
            switch (menu) {
                case 1:
                    System.out.println("");
                    System.out.println("Thêm mới");
                    instructorService.add();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Xóa thông tin");
                    instructorService.delect();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Hiển thị danh sách");
                    instructorService.display();
                    break;
                case 4:
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