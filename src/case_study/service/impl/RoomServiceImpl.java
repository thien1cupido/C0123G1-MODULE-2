package case_study.service.impl;

import case_study.model.Room;
import case_study.repository.IRoomRepository;
import case_study.repository.impl.RoomRepositoryImpl;
import case_study.service.IRoomService;
import case_study.util.Validate;

import java.util.*;

public class RoomServiceImpl implements IRoomService {
    static IRoomRepository roomRepository = new RoomRepositoryImpl();
    static LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
    static Validate validate = new Validate();
    Scanner scanner = new Scanner(System.in);

    static {
        roomIntegerLinkedHashMap = roomRepository.display();
    }

    @Override
    public void addRoom() {
        String idRoom, nameRoom, usableAre, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceInclude;
        System.out.print("Enter id room(SVRO-XXXX): ");
        idRoom = scanner.nextLine();
        idRoom = validate.checkRegex(idRoom, validate.getRegexIDRoom());
        System.out.print("Enter name service room: ");
        nameRoom = scanner.nextLine();
        nameRoom = validate.checkRegex(nameRoom, validate.getRegexNameService());
        System.out.print("Enter room area: ");
        usableAre = scanner.nextLine();
        usableAre = validate.checkRegex(usableAre, validate.getRegexServiceArea());
        System.out.print("Enter rental costs room: ");
        rentalCosts = scanner.nextLine();
        rentalCosts = validate.checkRegex(rentalCosts, validate.getRegexRentalCost());
        System.out.print("Enter maximum number of peoples in room: ");
        maximumNumberOfPeople = scanner.nextLine();
        maximumNumberOfPeople = validate.checkRegex(maximumNumberOfPeople, validate.getRegexNumberMaxPeoples());
        rentalType = validate.getRentalType();
        System.out.print("Enter the free service included in room: ");
        freeServiceInclude = scanner.nextLine();
        roomRepository.add(new Room(idRoom, nameRoom, Float.parseFloat(usableAre), Integer.parseInt(rentalCosts),
                Integer.parseInt(maximumNumberOfPeople), rentalType, freeServiceInclude), 0);
        System.out.println("more success");
    }

    public void displayRoom() {
        Set<Room> villaSet = roomIntegerLinkedHashMap.keySet();
        if (roomIntegerLinkedHashMap != null) {
            for (Room room : villaSet) {
                System.out.println(room + " value: " + roomIntegerLinkedHashMap.get(room));
            }
        } else {
            System.out.println("There are no more rooms in the list");
        }
    }


}
