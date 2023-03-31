package case_study.service.impl;

import case_study.data.FuramaData;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepositoryImpl;
import case_study.service.IEmployeeService;
import case_study.util.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static final String PATH_FILE = "src\\case_study\\data\\employee_data.csv";
    static List<Employee> employeeList = new ArrayList<>();
    static IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    static Employee employee = new Employee();
    static Scanner scanner = new Scanner(System.in);

    static {
        employeeList = ReadAndWriteEmployee.readFileEmployee(PATH_FILE);
    }

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
                        break;
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
                    employeeRepository.add(employeeList);
                    System.out.println("\n");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai vui lòng nhập lại");
                flag = true;
            }
        } while (!flag);
    }

    @Override
    public void display() {
        List<Employee> employeeList1 = employeeRepository.display();
        if (!employeeList1.isEmpty()) {
            for (Employee e : employeeList1
            ) {
                System.out.println(e);
            }
        } else {
            System.out.println("Không có employee nào");
        }
    }

    @Override
    public void edit() {
        boolean flag;
        int id;
        do {
            flag = true;
            System.out.print("Nhập id muốn sửa: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employeeList.size(); i++) {
                if (id == employeeList.get(i).getEmployeeCode()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Mời nhập lại");
                flag = true;
            }
        } while (flag);
        for (int i = 0; i < employeeList.size(); i++) {
            if (id == employeeList.get(i).getEmployeeCode()) {
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
                employeeList.set(i, new Employee(name, birthOfDay, gender, citizenIdentification, phoneNumber, email, id, level, position, Integer.parseInt(salary)));
                employeeRepository.edit(employeeList);
                break;
            }
        }
    }
}