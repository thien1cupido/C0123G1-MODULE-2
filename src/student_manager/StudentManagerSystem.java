package student_manager;
import java.util.Scanner;

public class StudentManagerSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean flag;
        do {
            flag = true;
            System.out.println("1.Display\n" +
                    "2.Add\n" +
                    "3.Update\n" +
                    "4.Delete\n" +
                    "5.Exit");
            System.out.println("Lựa chọn tính năng ");
            menu = Integer.parseInt(scanner.nextLine());
            StudentManager studentManager=new StudentManager();
            switch (menu) {
                case 1:
                    System.out.println("Hiển thị danh sách học viên");
                    studentManager.display();
                    break;
                case 2:
                    System.out.println("Thêm mới học viên");
                    studentManager.add();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa thông tin học viên");
                    break;
                case 4:
                    System.out.println("Xóa thông tin học viên");
                    studentManager.delect();
                    break;
                case 5:
                    System.out.println("Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn, xin mời nhập lại");
            }
        } while (flag);
    }
}