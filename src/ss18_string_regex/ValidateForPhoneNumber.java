package ss18_string_regex;

import java.util.Scanner;

public class ValidateForPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra SĐT");
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        String SDT;
        do {
            flag = true;
            System.out.print("Nhập SĐT: ");
            SDT = scanner.nextLine();
            if (checkPhoneNumber(SDT)) {
                System.out.println("SĐT hợp lệ");
                flag = false;
            } else {
                System.out.println("SĐT không hợp lệ");
            }
        } while (flag);
    }

    public static boolean checkPhoneNumber(String name) {
        String reGex = "^[0-9]{2}0[0-9]{9}$";
        boolean check = name.matches(reGex);
        return check;
    }
}
