package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < chuoi.length(); i++) {
            char max = chuoi.charAt(i);
            String result = String.valueOf(chuoi.charAt(i));
            for (int j = i; j < chuoi.length(); j++) {
                if (max < chuoi.charAt(j)) {
                    result += String.valueOf(chuoi.charAt(j));
                    max = chuoi.charAt(j);
                }
            }
            linkedList.add(result);
            result = "";
        }
        String sizeMax = String.valueOf(linkedList.get(0));
        for (String s : linkedList
        ) {
            if (sizeMax.length() < s.length()) {
                sizeMax = s;
            }
        }
        System.out.print("Chuỗi tăng dần liên tiếp là: "+sizeMax);
    }
}