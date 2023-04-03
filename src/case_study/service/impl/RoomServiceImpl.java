package case_study.service.impl;

import case_study.model.Room;
import case_study.service.IRoomService;
import case_study.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl implements IRoomService {
    static List<Room>roomList=new ArrayList<>();
    static Validate validate =new Validate();
    Scanner scanner =new Scanner(System.in);
    @Override
    public void add() {
        System.out.print("Nhập id Room(SVRO-XXXX): ");
        String idRoom = scanner.nextLine();
        idRoom = validate.checkRegex(idRoom, validate.getRegexIDRoom());
        System.out.print("Nhập name Room: ");
        String nameRoom = scanner.nextLine();
        nameRoom = validate.checkRegex(nameRoom, validate.getRegexNameService());
        System.out.print("Nhập diện tích Room: ");
        String usableAre = scanner.nextLine();
        usableAre = validate.checkRegex(usableAre, validate.getRegexServiceArea());
        System.out.print("Nhập giá cho thuê Room: ");
        String rentalCosts = scanner.nextLine();
        rentalCosts = validate.checkRegex(rentalCosts, validate.getRegexRentalCost());
        System.out.print("Nhập số người tối đa trong Room: ");
        String maximumNumberOfPeople = scanner.nextLine();
        maximumNumberOfPeople = validate.checkRegex(maximumNumberOfPeople, validate.getRegexNumberMaxPeoples());
        String rentalType = validate.getRentalType();
        System.out.print("Nhập dịch vụ miễn phí đi kèm trong Room: ");
        String freeServiceInclude = scanner.nextLine();
        roomList.add(new Room(idRoom, nameRoom, Float.parseFloat(usableAre), Integer.parseInt(rentalCosts),
                Integer.parseInt(maximumNumberOfPeople), rentalType, freeServiceInclude));
    }

    @Override
    public void display() {
        if (!roomList.isEmpty()){
            for (Room r:roomList
                 ) {
                System.out.println(r);
            }
        }else {
            System.out.println("Không còn phòng");
        }
    }

    @Override
    public void edit() {

    }
}
