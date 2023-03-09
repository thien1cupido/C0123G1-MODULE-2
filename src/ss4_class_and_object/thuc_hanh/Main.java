package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        float dai = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập chiều rộng: ");
        float rong = Float.parseFloat(scanner.nextLine());
        LopHinhChuNhat lopHinhChuNhat =new LopHinhChuNhat(dai,rong);
        System.out.println("Hình chữ nhật \n" +lopHinhChuNhat.inThongSoHCN());
        System.out.println("Diện tích : "+lopHinhChuNhat.layDienTich());
        System.out.println("Chu vi: "+lopHinhChuNhat.inThongSoHCN());
    }
}