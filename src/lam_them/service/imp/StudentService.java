package lam_them.service.imp;

import lam_them.model.Student;
import lam_them.service.IPersonService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IPersonService {
    static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(0, "Nguyễn Trung Thiện", "15/7/1999", "nam", "C0123G1", 7.5f));
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int count = 0;
        int id;
        do {
            flag = true;
            System.out.print("Nhập id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Student student : students) {
                if (id == student.getId()) {
                    System.out.println("Id đã trùng vui lòng nhập lại");
                    flag = false;
                } else {
                    count++;
                }
            }
        } while (!flag);
        if (count == students.size()) {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập ngày sinh: ");
            String birthOfDay = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            String gender = scanner.nextLine();
            System.out.print("Nhập tên lớp: ");
            String classes = scanner.nextLine();
            System.out.print("Nhập điểm số: ");
            float scores = Float.parseFloat(scanner.nextLine());
            students.add(new Student(id, name, birthOfDay, gender, classes, scores));
        }
    }

    @Override
    public void display() {
        if (students.size() != 0) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không có ai ở trong danh sách");
        }
    }


    @Override
    public void delect() {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int id;
        do {
            flag = false;
            System.out.print("Nhập Id bạn muốn xóa: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Student student : students) {
                if (id == student.getId()) {
                    System.out.println("Bạn có muốn xóa học sinh '" + student.getName() + "' không");
                    System.out.print("Nhập 'có' hoặc 'không' để xác nhận: ");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "có":
                            students.remove(student);
                            System.out.println("Đã xóa học sinh có ID là " + id + " khỏi danh sách.");
                            flag = true;
                            break;
                        case "không":
                            flag = true;
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                }
            }
            if (!flag) {
                if (students.size() == 0) {
                    System.out.println("Không còn ai ở trong danh sách để xóa");
                    return;
                } else {
                    System.out.println("Không có học sinh có ID là " + id + " trong danh sách. Vui lòng nhập lại.");
                }
            }
        } while (!flag);
    }
}

