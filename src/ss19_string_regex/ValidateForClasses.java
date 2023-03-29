package ss19_string_regex;

import java.util.Scanner;

public class ValidateForClasses {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra tên lớp ");
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            flag = true;
            System.out.print("Nhập tên lớp: ");
            String nameClasse = scanner.nextLine();
            if (checkNameClass(nameClasse)) {
                System.out.println("Tên hợp lệ");
                flag = false;
            } else {
                System.out.println("Tên không hợp lệ");
            }
        } while (flag);
    }

    public static boolean checkNameClass(String name) {
        String reGex = "^[CAP][0-9]{4}[GHIK]$";
        boolean check = name.matches(reGex);
        return check;
    }
}
