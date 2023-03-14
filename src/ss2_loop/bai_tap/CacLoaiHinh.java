package ss2_loop.bai_tap;

import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean flag=true;
        System.out.println("1.Hình chữ nhật " +
                "\n2.Hình tam giác đứng " +
                "\n3.Hình tam giác ngược" +
                "\n4.Hình tam giác cân" +
                "\n5.Thoát");
        do {
            System.out.print("Nhập thứ tự: ");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("Hình chữ nhật ");
                    System.out.print("Nhập chiều dài n: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng m: ");
                    int m = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hình chữ nhật có độ dài " + n + " và độ rộng " + m);
                    System.out.println(layHinhChuNhat(m, n));
                    break;
                case 2:
                    System.out.println("Hình tam giác đứng ");
                    System.out.print("Nhập chiều cao tam giác: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hình tam giác đứng có chiều cao " + a);
                    System.out.println(layHinhTamGiac(a));
                    break;
                case 3:
                    System.out.println("Hình tam giác ngược ");
                    System.out.print("Nhập chiều cao tam giác: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hình tam giác ngược có chiều cao " + b);
                    System.out.println(layHinhTamGiacNguoc(b));
                    break;
                case 4:
                    System.out.println("Hình tam giác cân ");
                    System.out.print("Nhập chiều cao tam giác: ");
                    int c = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hình tam giác cân có chiều cao " + c);
                    System.out.println(layHinhTamGiacCan(c));
                    break;
                case 5:
                    System.out.println("Thoát");
                    flag=false;
                    break;
                default:
                    System.out.println("Nhập lại");
            }
        } while (flag);
    }

    public static String layHinhChuNhat(int number1, int number2) {
        String s = "";
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                s += "*";
            }
            s += "\n";
        }
        return s;
    }

    public static String layHinhTamGiac(int number1) {
        String s = "";
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j <= i; j++) {
                s += "*";
            }
            s += "\n";
        }
        return s;
    }

    public static String layHinhTamGiacNguoc(int number) {
        String s = "";
        for (int i = 0; i < number; i++) {
            for (int j = number - i; j > 0; j--) {
                s += "*";
            }
            s += "\n";
        }
        return s;
    }

    public static String layHinhTamGiacCan(int number) {
        String s = "";
        for (int i = 0; i < number; i++) {
            for (int j = number - 1; j > i; j--) {
                s += " ";
            }
            for (int k = 0; k < (i + 1) * 2 - 1; k++) {
                s += "*";
            }
            s += "\n";
        }
        return s;
    }
}