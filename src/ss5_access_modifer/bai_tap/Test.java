package ss5_access_modifer.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        String classes = scanner.nextLine();
        Student student = new Student();
        if (name.equals("") && classes.equals("")) {
                System.out.println(student.toString());
        } else {
            student.setName(name);
            student.setClasses(classes);
            System.out.println(student.toString());
        }
    }
}