package case_study.service.impl;

import case_study.util.FuramaData;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepositoryImpl;
import case_study.service.IEmployeeService;
import case_study.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    Scanner scanner = new Scanner(System.in);
    static Validate validate = new Validate();
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList = employeeRepository.display();
    }

    @Override
    public void add() {
        boolean flag;
        do {
            try {
                flag = true;
                System.out.print("Enter id employee: ");
                int employeeCode = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employeeCode == employee.getEmployeeCode()) {
                        System.out.println("Employee id code has been duplicated, please re-enter");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print("Enter name employee: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter birth of day employee: ");
                    String birthOfDay = scanner.nextLine();
                    birthOfDay = validate.checkRegex(birthOfDay, validate.getRegexBirthOfDay());
                    System.out.print("Enter gender employee: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter citizen identification employee: ");
                    String citizenIdentification = scanner.nextLine();
                    System.out.print("Enter phone number employee: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email employee: ");
                    String email = scanner.nextLine();
                    String level = FuramaData.getLevel();
                    String position = FuramaData.getPositionl();
                    System.out.print("Enter employee salary: ");
                    String salary = scanner.nextLine();
                    employeeRepository.add(new Employee(name, birthOfDay, gender, citizenIdentification, phoneNumber,
                            email, employeeCode, level, position, Double.parseDouble(salary)));
                    System.out.println("More susscess");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong format, please re-enter");
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
            System.out.println("There are no employees in the list");
        }
    }

    @Override
    public void edit() {
        boolean flag;
        int id;
        do {
            try {
                System.out.print("Enter the id to edit: ");
                id = Integer.parseInt(scanner.nextLine());
                flag = true;
                for (int i = 0; i < employeeList.size(); i++) {
                    if (id == employeeList.get(i).getEmployeeCode()) {
                        flag = false;
                        updateEmployeeInformation(employeeList.get(i), i);
                        break;
                    }
                }
                if (flag) {
                    System.out.println("No employee with that ID was found. Please try again.");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid employee ID.");
                flag = true;
            }
        } while (flag);
    }

    public void updateEmployeeInformation(Employee employee, int i) {
        boolean flag;
        do {
            try {
                flag = true;
                System.out.print("Choose 1 of the following functions\n" +
                        "1.\tEnter name employee\n" +
                        "2.\tEnter birth of day employee\n" +
                        "3.\tEnter gender employee\n" +
                        "4.\tEnter citizen identification employee\n" +
                        "5.\tEnter phone number employee\n" +
                        "6.\tEnter email employee\n" +
                        "7.\tEnter level employee\n" +
                        "8.\tEnter position employee\n" +
                        "9.\tEnter salary employee\n" +
                        "0.\tExit\n" +
                        "Select information to correct: ");
                String choose = scanner.nextLine();
                switch (choose) {
                    case "0":
                        System.out.println("Exit");
                        flag = false;
                        break;
                    case "1":
                        System.out.println("Correction name employee");
                        System.out.print("Enter name employee: ");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    case "2":
                        System.out.println("Correction birth of day employee");
                        System.out.print("Enter birth of day employee: ");
                        String birthOfDay = scanner.nextLine();
                        employee.setBirthOfDay(birthOfDay);
                        break;
                    case "3":
                        System.out.println("Correction gender employee");
                        System.out.print("Enter gender employee: ");
                        String gender = scanner.nextLine();
                        employee.setGender(gender);
                        break;
                    case "4":
                        System.out.println("Correction citizen identification employee");
                        System.out.print("Enter citizen identification employee: ");
                        String citizenIdentification = scanner.nextLine();
                        employee.setCitizenIdentification(citizenIdentification);
                        break;
                    case "5":
                        System.out.println("Correction phone number employee");
                        System.out.print("Enter phone number employee: ");
                        String phoneNumber = scanner.nextLine();
                        employee.setPhoneNumber(phoneNumber);
                        break;
                    case "6":
                        System.out.println("Correction email employee");
                        System.out.print("Enter email employee: ");
                        String email = scanner.nextLine();
                        employee.setEmail(email);
                        break;
                    case "7":
                        System.out.println("Correction level employee");
                        System.out.print("Enter level employee: ");
                        String level = FuramaData.getLevel();
                        employee.setLevel(level);
                        break;
                    case "8":
                        System.out.println("Correction position employee");
                        System.out.print("Enter position employee: ");
                        String position = FuramaData.getPositionl();
                        employee.setPosition(position);
                        break;
                    case "9":
                        System.out.println("Correction salary employee");
                        System.out.print("Enter salary employee: ");
                        String salary = scanner.nextLine();
                        employee.setSalary(Double.parseDouble(salary));
                        break;
                    default:
                        System.out.println("Enter the wrong choice, please re-enter!");
                        flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong format, please re-enter");
                flag = true;
            } finally {
                employeeRepository.edit(i, employeeList);
            }
        } while (flag);
    }
}
