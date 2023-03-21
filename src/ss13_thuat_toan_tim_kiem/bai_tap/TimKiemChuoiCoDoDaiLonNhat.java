package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemChuoiCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        char[] arr = chuoi.toCharArray();
        ArrayList<String> arrayList = new ArrayList<>();
        String temp = "";
        char max = arr[0];
        for (char c : arr) {
            if (max < c) {
                max = c;
                temp += c;
            } else {
                max = c;
                arrayList.add(temp);
                temp = "";
                temp += c;
            }
        }
        String stringMax = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (stringMax.length() < arrayList.get(i).length()) {
                stringMax = arrayList.get(i);
            }
        }
        System.out.println(stringMax);
    }
}
