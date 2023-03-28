package ss18_string_regex;

import java.util.Scanner;

public class ValidateForPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra SĐT");
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        double SDT = 0;
        do {
            try {
                flag = true;
                System.out.print("Nhập SĐT: ");
                SDT = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("SĐT không phải là chữ");
                flag = false;
            }
            if (checkPhoneNumber(SDT)) {
                flag = false;
                System.out.println("SĐT hợp lệ");
            } else {
                System.out.println("SĐT không hợp lệ");
            }
        } while (flag);
    }

    public static boolean checkPhoneNumber(double name) {
        String SDT = String.valueOf(name);
        String reGex = "^[0-9]{2}0[0-9]{9}$";
        boolean check = SDT.matches(reGex);
        return check;
    }
}
