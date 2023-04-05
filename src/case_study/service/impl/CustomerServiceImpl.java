package case_study.service.impl;

import case_study.repository.ICustommerRepository;
import case_study.repository.impl.CustommerRepositoryImpl;
import case_study.util.FuramaData;
import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.util.Validate;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static ICustommerRepository customerRepository = new CustommerRepositoryImpl();
    Scanner scanner = new Scanner(System.in);
    static Validate validate = new Validate();
    static LinkedList<Customer> customerList = new LinkedList<>();
    static {
        customerList=customerRepository.display();
    }

    @Override
    public void add() {
        boolean flag;
        do {
            try {
                flag = true;
                System.out.print("Enter id customer: ");
                int customerCode = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (customerCode == customer.getCustomerCode()) {
                        System.out.println("Customer id code has been duplicated, please re-enter");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print("Enter name customer: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter birth of day customer: ");
                    String birthOfDay = scanner.nextLine();
                    birthOfDay = validate.checkRegex(birthOfDay, validate.getRegexBirthOfDay());
                    System.out.print("Enter gender customer: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter citizen identification customer: ");
                    String citizenIdentification = scanner.nextLine();
                    System.out.print("Enter phone number customer: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email customer: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter customer type: ");
                    String customerType = scanner.nextLine();
                    System.out.print("Enter aderess customer: ");
                    String address = scanner.nextLine();
                    Customer customer =new Customer(name, birthOfDay, gender, citizenIdentification, phoneNumber,
                            email, customerCode, customerType, address);
                    customerRepository.add(customer);
                    customerList.add(customer);
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
        if (customerList.isEmpty()) {
            System.out.println("There are no customer in the list");
        } else {
            for (Customer customer : customerList
            ) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public void edit() {
        boolean flag;
        int id;
        do {
            try {
                flag = true;
                System.out.print("Enter the id to edit: ");
                id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < customerList.size(); i++) {
                    if (id == customerList.get(i).getCustomerCode()) {
                        updateCustomerInformation(customerList.get(i), i);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("No customer with that ID was found, please re-enter");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong format, please re-enter");
                flag = true;
            }
        } while (flag);
    }

    private void updateCustomerInformation(Customer customer, int i) {
        boolean flag;
        do {
            try {
                flag = true;
                System.out.print("Choose 1 of the following functions\n" +
                        "1.\tEnter name customer\n" +
                        "2.\tEnter birth of day customer\n" +
                        "3.\tEnter gender customer\n" +
                        "4.\tEnter citizen identification customer\n" +
                        "5.\tEnter phone number customer\n" +
                        "6.\tEnter email customer\n" +
                        "7.\tEnter level customer\n" +
                        "8.\tEnter position customer\n" +
                        "9.\tEnter salary customer\n" +
                        "0.\tExit\n" +
                        "Select information to correct: ");
                String choose = scanner.nextLine();
                switch (choose) {
                    case "0":
                        System.out.println("Exit");
                        flag = false;
                        break;
                    case "1":
                        System.out.println("Correction name customer");
                        System.out.print("Enter name customer: ");
                        String name = scanner.nextLine();
                        customer.setName(name);
                        break;
                    case "2":
                        System.out.println("Correction birth of day customer");
                        System.out.print("Enter birth of day customer: ");
                        String birthOfDay = scanner.nextLine();
                        customer.setBirthOfDay(birthOfDay);
                        break;
                    case "3":
                        System.out.println("Correction gender customer");
                        System.out.print("Enter gender customer: ");
                        String gender = scanner.nextLine();
                        customer.setGender(gender);
                        break;
                    case "4":
                        System.out.println("Correction citizen identification customer");
                        System.out.print("Enter citizen identification customer: ");
                        String citizenIdentification = scanner.nextLine();
                        customer.setCitizenIdentification(citizenIdentification);
                        break;
                    case "5":
                        System.out.println("Correction phone number customer");
                        System.out.print("Enter phone number customer: ");
                        String phoneNumber = scanner.nextLine();
                        customer.setPhoneNumber(phoneNumber);
                        break;
                    case "6":
                        System.out.println("Correction email customer");
                        System.out.print("Enter email customer: ");
                        String email = scanner.nextLine();
                        customer.setEmail(email);
                        break;
                    case "7":
                        System.out.println("Correction customer type");
                        System.out.print("Enter customer type: ");
                        String customrType = FuramaData.getLevel();
                        customer.setCustomerType(customrType);
                        break;
                    case "8":
                        System.out.println("Correction address customer");
                        System.out.print("Enter address customer: ");
                        String address = FuramaData.getPositionl();
                        customer.setAddress(address);
                        break;
                    default:
                        System.out.println("Enter the wrong choice, please re-enter!");
                        flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong format, please re-enter");
                flag = true;
            } finally {
                customerRepository.edit(i, customerList);
            }
        } while (flag);
    }
}
