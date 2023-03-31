package case_study.controllers;

import case_study.service.ICustomerService;
import case_study.service.IEmployeeService;
import case_study.service.impl.CustomerServiceImpl;
import case_study.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static IEmployeeService employeeService = new EmployeeServiceImpl();
    static ICustomerService customerService = new CustomerServiceImpl();
    static String choose;

    public static void displayMainMenu() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn các chức năng:\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management\n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "Nhập lựa chọn: ");
            choose = scanner.nextLine();
            System.out.print("\n");
            switch (choose) {
                case "1":
                    System.out.println("Employee Management");
                    displayEmployeeManagement();
                    break;
                case "2":
                    System.out.println("Customer Management");
                    displayCustomerManagement();
                    break;
                case "3":
                    System.out.println("Facility Management");
                    displayFacilityManagement();
                    break;
                case "4":
                    System.out.println("Booking Management");
                    displayBookingManagement();
                    break;
                case "5":
                    System.out.println("Promotion Management");
                    displayPromotionManagement();
                    break;
                case "6":
                    System.out.println("Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

    public static void displayEmployeeManagement() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn các chức năng:\n" +
                    "1.\tDisplay list employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\tEdit employee\n" +
                    "4.\tReturn main menu\n" +
                    "Nhâp lựa chọn: ");
            choose = scanner.nextLine();
            System.out.print("\n");
            switch (choose) {
                case "1":
                    System.out.println("Display list employees");
                    employeeService.display();
                    break;
                case "2":
                    System.out.println("Add new employee");
                    employeeService.add();
                    break;
                case "3":
                    System.out.println("Edit employee");
                    employeeService.edit();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

    public static void displayCustomerManagement() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn các chức năng:\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n" +
                    "Nhâp lựa chọn: ");
            choose = scanner.nextLine();
            System.out.print("\n");
            switch (choose) {
                case "1":
                    System.out.println("Display list customers");
                    customerService.display();
                    break;
                case "2":
                    System.out.println("Add new customer");
                    customerService.add();
                    break;
                case "3":
                    System.out.println("Edit customer");
                    customerService.edit();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

    public static void displayFacilityManagement() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn các chức năng:\n" +
                    "1.\tDisplay list facility\n" +
                    "2.\tAdd new facility\n" +
                    "3.\tDisplay list facility maintenance\n" +
                    "4.\tReturn main menu\n" +
                    "Nhâp lựa chọn: ");
            choose = scanner.nextLine();
            System.out.print("\n");
            switch (choose) {
                case "1":
                    System.out.println("Display list facility");
                    break;
                case "2":
                    System.out.println("Add new facility");
                    break;
                case "3":
                    System.out.println("Display list facility maintenance");
                    break;
                case "4":
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

    public static void displayBookingManagement() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn các chức năng:\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contract\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n" +
                    "Nhâp lựa chọn: ");
            choose = scanner.nextLine();
            System.out.print("\n");
            switch (choose) {
                case "1":
                    System.out.println("Add new booking");
                    break;
                case "2":
                    System.out.println("Display list booking");
                    break;
                case "3":
                    System.out.println("Create new contract");
                    break;
                case "4":
                    System.out.println("Display list contracts");
                    break;
                case "5":
                    System.out.println("Edit contracts");
                    break;
                case "6":
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }

    public static void displayPromotionManagement() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn các chức năng:\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n" +
                    "Nhâp lựa chọn: ");
            choose = scanner.nextLine();
            System.out.print("\n");
            switch (choose) {
                case "1":
                    System.out.println("Display list customers use service");
                    break;
                case "2":
                    System.out.println("Display list customers get voucher");
                    break;
                case "3":
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }
}
