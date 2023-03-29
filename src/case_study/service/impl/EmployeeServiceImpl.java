package case_study.service.impl;

import case_study.data.FuramaData;
import case_study.model.Employee;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static EmployeeRepository employeeRepository = new EmployeeRepository();
    static Employee employee = new Employee();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        boolean flag;
        do {
            try {
                flag = true;
                System.out.print("Nhập id nhân viên: ");
                int employeeCode = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employeeCode == employee.getEmployeeCode()) {
                        System.out.println("Mã id employee đã trùng, vui lòng nhập lại");
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.print("Nhập tên của nhân viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập ngày sinh của nhân viên: ");
                    String birthOfDay = scanner.nextLine();
                    System.out.print("Nhập giới tính của nhân viên: ");
                    String gender = scanner.nextLine();
                    System.out.print("Nhập CMND của nhân viên: ");
                    String citizenIdentification = scanner.nextLine();
                    System.out.print("Nhập SĐT của nhân viên: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Nhập email của nhân viên: ");
                    String email = scanner.nextLine();
                    String level = FuramaData.getLevel();
                    String position = FuramaData.getPositionl();
                    System.out.print("Nhập mức lương của nhân viên: ");
                    String salary = scanner.nextLine();
                    employee = new Employee(name, birthOfDay, gender, citizenIdentification, phoneNumber,
                            email, employeeCode, level, position, Double.parseDouble(salary));
                    employeeList.add(employee);
                    System.out.println("\n");
                    employeeRepository.add(employeeList);
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai vui lòng nhập lại");
                flag = true;
            }
        } while (!flag);
    }


    @Override
    public void display() {
        if (!employeeList.isEmpty()) {
            for (Employee e : employeeList
            ) {
                System.out.println(e);
            }
        } else {
            System.out.println("Không có employee nào");
        }
    }

    public void EditEmployee() {

    }
}
