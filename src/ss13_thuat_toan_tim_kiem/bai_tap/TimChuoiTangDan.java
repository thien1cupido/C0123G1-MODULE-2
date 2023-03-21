package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        chuoi = chuoi.trim();
        char []arr=chuoi.toCharArray();
        int max=0;
        for (char c : arr) {
            if (max < c) {
                max = c;
                System.out.print(c);
            }
        }
    }
}
