package ss2_loop.bai_tap;

import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chiều rộng m: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Hình chữ nhật có độ dài "+n+" và độ rộng "+m);
        System.out.println(layHinhChuNhat(m,n));
        System.out.print("Nhập chiều cao tam giác: ");
        int h=Integer.parseInt(scanner.nextLine());
        System.out.println(layHinhTamGiac(h));
        System.out.println(layHinhTamGiacNguoc(h));
        System.out.println(layHinhTamGiacCan(h));

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
            for (int j = number-i; j >0 ;j--){
                s += "*";
            }
            s+="\n";
        }
        return s;
    }
    public static String layHinhTamGiacCan(int number){
        String s="";
        for (int i = 0; i < number; i++) {
            for (int j=number-1;j>i;j--){
                s+=" ";
            }
            for (int k = 0; k <(i+1)*2-1 ; k++) {
                s+="*";
            }
            s+="\n";
        }
        return s;
    }
}