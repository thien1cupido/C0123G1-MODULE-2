package case_study.service.impl;

import case_study.model.Booking;
import case_study.model.Customer;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustommerRepository;
import case_study.repository.impl.BookingRepositoryImpl;
import case_study.repository.impl.CustommerRepositoryImpl;
import case_study.service.IBookingService;
import case_study.service.ICustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceImpl implements IBookingService {
    static List<String> serviceTypeList = new ArrayList<>();

    static {
        serviceTypeList.add("Villa");
        serviceTypeList.add("House");
        serviceTypeList.add("Room");
    }

    static Scanner scanner = new Scanner(System.in);
    private IBookingRepository bookingRepository = new BookingRepositoryImpl();
    private ICustomerService customerService = new CustomerServiceImpl();
    private ICustommerRepository custommerRepository = new CustommerRepositoryImpl();

    @Override
    public void add() {
        customerService.display();
        LinkedList<Customer> linkedList = custommerRepository.display();
        boolean flag;
        int idCustomer = 0;
        do {
            try {
                flag = true;
                System.out.print("Enter id customer : ");
                idCustomer = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < linkedList.size(); i++) {
                    if (idCustomer == linkedList.get(i).getCustomerCode()) {
                        idCustomer = linkedList.get(i).getCustomerCode();
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("customer id does not exist");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong format, please re-enter!");
                flag = true;
            }
        } while (flag);
        System.out.print("Enter id booking: ");
        int idBooking = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter start day: ");
        String startDay = scanner.nextLine();
        System.out.print("Enter end day: ");
        String endDay = scanner.nextLine();
        String serviceType = selectServiceType();
        System.out.print("Enter service name: ");
        String serviceName = scanner.nextLine();
        bookingRepository.add(new Booking(idBooking, startDay, endDay, idCustomer, serviceName, serviceType));
    }

    @Override
    public void display() {

    }

    public String selectServiceType() {
        String result = "";
        boolean flag;
        String choose;
        do {
            flag = false;
            System.out.print("Selection service type\n" +
                    "1.Villa\n" +
                    "2.House\n" +
                    "3.Room\n" +
                    "Enter the choice:");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Selected villa");
                    result = serviceTypeList.get(0);
                    break;
                case "2":
                    System.out.println("Selected House");
                    result = serviceTypeList.get(1);
                    break;
                case "3":
                    System.out.println("Selected Room");
                    result = serviceTypeList.get(1);
                    break;
                default:
                    System.out.println("Enter the wrong the choice, please re-enter!");
                    flag = true;
            }
        } while (flag);
        return result;
    }

}
