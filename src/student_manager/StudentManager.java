package student_manager;

import java.util.Scanner;

public class StudentManager {
    static Student[] students = new Student[10];

    static {
        students[0] = new Student(0, "Nguyễn Trung Thiện1", true);
        students[1] = new Student(2, "Nguyễn Trung Thiện2", true);
        students[2] = new Student(3, "Nguyễn Trung Thiện3", true);
    }

    //in ra màn hình
    public void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == 0) {
                    continue;
                }
                System.out.println(students[i]);
            } else {
                break;
            }
        }
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        Student student = new Student(id, name, gender);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
//                if (students[i].getId()=)
//                students[i] = student;
                break;
            }
        }
    }

    public void delect() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() != 0) {
                if (id == students[i].getId()) {
                    students[i]=null;
                }
            }
        }
    }
}
