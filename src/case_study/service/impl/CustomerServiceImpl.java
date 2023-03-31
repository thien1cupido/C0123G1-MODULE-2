package case_study.service.impl;

import case_study.data.FuramaData;
import case_study.model.Customer;
import case_study.service.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    @Override
    public void add() {
        int id;
        boolean flag;
        do {
            flag = false;
            System.out.print("Nhập id khách hàng: ");
            id = Integer.parseInt(scanner.nextLine());
//            int size=customerList.size();
            for (int i = 0; i < customerList.size(); i++) {
                if (id == customerList.get(i).getCustomerCode()) {
                    System.out.println("id đã có, vui lòng nhập lại");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.print("Nhập tên khách hàng: ");
                String name = scanner.nextLine();
                System.out.print("Nhập ngày sinh khách hàng: ");
                String birthOfDay = scanner.nextLine();
                System.out.print("Nhập giới tính khách hàng: ");
                String gender = scanner.nextLine();
                System.out.print("Nhập CMND khách hàng: ");
                String citizenIdentification = scanner.nextLine();
                System.out.print("Nhập SĐT khách hàng: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Nhập email khách hàng: ");
                String email = scanner.nextLine();
                String customerType = FuramaData.getCustomerType();
                System.out.print("Nhập địa chỉ khách hàng: ");
                String address = scanner.nextLine();
                customerList.add(new Customer(name, birthOfDay, gender, citizenIdentification, phoneNumber, email, id, customerType, address));
            }
        } while (flag);
    }

    @Override
    public void display() {
        if (!customerList.isEmpty()) {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }else {
            System.out.println("Không có khách hàng nào trong danh sách");
        }
    }

    @Override
    public void edit() {

    }
}
