package lam_them.service.imp;

import lam_them.model.Instructor;
import lam_them.service.IPersonService;

import java.util.ArrayList;
import java.util.Scanner;

public class InstructorService implements IPersonService {
    static ArrayList<Instructor> instructors = new ArrayList<>();

    static {
        instructors.add(new Instructor(0, "Nguyễn Văn A", "23/4/1995", "nam", "ngôn ngữ C#"));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < instructors.size(); i++) {
            if (id == instructors.get(i).getId()) {
                System.out.println("Id đã trùng vui lòng nhập lại");
                break;
            } else {
                count++;
            }
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập ngày sinh: ");
            String birthOfDay = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            String gender = scanner.nextLine();
            System.out.println("Nhập chuyên môn: ");
            String specialize = scanner.nextLine();
            instructors.add(new Instructor(id, name, birthOfDay, gender, specialize));
        }
    }

    @Override
    public void display() {
        if (instructors.size() > 0) {
            for (Instructor instructor : instructors) {
                System.out.println(instructor);
            }
        } else {
            System.out.println("Không có ai ở trong danh sách");
        }
    }

    @Override
    public void delect() {
        boolean flag;
        int id;
        do {
            flag = false;
            System.out.print("Nhập Id bạn muốn xóa: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Instructor instructor : instructors) {
                if (id == instructor.getId()) {
                    System.out.println("Bạn có muốn xóa học sinh '" + instructor.getName() + "' không");
                    System.out.print("Nhập 'có' hoặc 'không' để xác nhận: ");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "có":
                            instructors.remove(instructor);
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
                if (instructors.size() == 0) {
                    System.out.println("không còn ai trong danh sách để xóa");
                } else {
                    System.out.println("Không có học sinh có ID là " + id + " trong danh sách. Vui lòng nhập lại.");
                }
            }
        } while (!flag);
    }
}