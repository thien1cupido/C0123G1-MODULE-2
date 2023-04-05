package case_study.service.impl;

import case_study.model.*;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustommerRepository;
import case_study.repository.impl.BookingRepositoryImpl;
import case_study.repository.impl.CustommerRepositoryImpl;
import case_study.service.IBookingService;
import case_study.service.ICustomerService;
import case_study.service.IFacilityService;
import case_study.util.Validate;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static List<String> serviceTypeList = new ArrayList<>();
    private final Validate validate = new Validate();
    private final IBookingRepository bookingRepository = new BookingRepositoryImpl();
    private final ICustomerService customerService = new CustomerServiceImpl();
    private final ICustommerRepository custommerRepository = new CustommerRepositoryImpl();
    private final IFacilityService facilityService = new FacilityServiceImpl();
    private final Villa villa =new Villa();
    private final Room room =new Room();
    private final House house =new House();

    static {
        serviceTypeList.add("Villa");
        serviceTypeList.add("House");
        serviceTypeList.add("Room");
    }
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        customerService.display();
        LinkedList<Customer> linkedList = custommerRepository.display();
        int idCustomer = 0;
        boolean flag;
        do {
            try {
                flag = true;
                System.out.print("Enter id customer : ");
                idCustomer = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < linkedList.size(); i++) {
                    if (idCustomer == linkedList.get(i).getCustomerCode()) {
                        flag = false;
                        break;
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
        int idBooking = 0;
        idBooking= getIDBooking(idBooking);
        System.out.print("Enter start day: ");
        String startDay = scanner.nextLine();
        startDay = validate.checkRegex(startDay, validate.getRegexStartAndEnday());
        System.out.print("Enter end day: ");
        String endDay = scanner.nextLine();
        endDay = validate.checkRegex(endDay, validate.getRegexStartAndEnday());
        facilityService.display();
        String serviceType = selectServiceType();
        System.out.print("Enter id service: ");
        String idService = scanner.nextLine();
        bookingRepository.add(new Booking(idBooking, startDay, endDay, idCustomer, idService, serviceType));
        facilityService.increaseThenBooking(idService, serviceType);
        System.out.println("Add success");
    }

    @Override
    public void display() {
        TreeSet<Booking> bookingTreeSet1 = bookingRepository.displayBooking();
        if (bookingTreeSet1.isEmpty()) {
            System.out.println("No element!");
        } else {
            for (Booking booking : bookingTreeSet1) {
                System.out.println(booking);
            }
        }
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
                    result = serviceTypeList.get(2);
                    break;
                default:
                    System.out.println("Enter the wrong the choice, please re-enter!");
                    flag = true;
            }
        } while (flag);
        return result;
    }
    public int getIDBooking(int idBooking){
        int id=0;
        boolean flag;
        TreeSet<Booking>bookingTreeSet=bookingRepository.displayBooking();
        do {
            try {
                flag=false;
                System.out.print("Enter id booking: ");
                id=Integer.parseInt(scanner.nextLine());
                for (Booking booking:bookingTreeSet) {
                    if (booking.getBookingCode()==idBooking){
                        System.out.println("ID Booking has been duplicated");
                        flag=true;
                    }
                    if (!flag){
                        System.out.println("Add susscess");
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Enter the wrong format, please re-enter!");
                flag =true;
            }
        }while (flag);
        return id;
    }
}
