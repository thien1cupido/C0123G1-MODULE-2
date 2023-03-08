package GiaiThuat;

import java.util.Scanner;

public class VeHinhThoiRong {
    public static void main(String[] args) {
        String s = "";
        int d = 5;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == d - 1 - i) {
                    s += "*";
                } else {
                    s += " ";
                }
            }
        }
        System.out.print(s);
    }
}
