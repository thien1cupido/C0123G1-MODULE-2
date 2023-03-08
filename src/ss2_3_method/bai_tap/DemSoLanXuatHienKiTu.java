package ss2_3_method.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String str ="codegymm";
    System.out.println("Nhập 1 kí tự bất kì: ");
    char kiTu= scanner.nextLine().charAt(0);
    int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==kiTu){
                count++;
            }
        }
        System.out.println("Có "+count+" kí tự trong chuỗi");
    }
}
