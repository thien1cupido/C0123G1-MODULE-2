package case_study.service.impl;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.model.abstract_class.Facility;
import case_study.repository.IHouseRepository;
import case_study.repository.IRoomRepository;
import case_study.repository.IVillaRepository;
import case_study.repository.impl.HouseRepositoryImpl;
import case_study.repository.impl.RoomRepositoryImpl;
import case_study.repository.impl.VillaRepositoryImpl;
import case_study.service.IFacilityService;
import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
    private final IRoomRepository roomRepository = new RoomRepositoryImpl();
    private final IHouseRepository houseRepository = new HouseRepositoryImpl();
    private final IVillaRepository villaRepository = new VillaRepositoryImpl();
    IVillaService villaService = new VillaServiceImpl();
    IHouseService houseService = new HouseServiceImpl();
    IRoomService roomService = new RoomServiceImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        boolean flag;
        String choose;
        do {
            flag = true;
            System.out.print("Function selection:\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "Enter the choice: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Add New Villa");
                    villaService.addVilla();
                    break;
                case "2":
                    System.out.println("Add New House");
                    houseService.addHouse();

                    break;
                case "3":
                    System.out.println("Add New Room");
                    roomService.addRoom();
                    break;
                case "4":
                    System.out.println("Back to menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter the wrong, please re-enter!");
            }
        } while (flag);
    }

    @Override
    public void display() {
        LinkedHashMap<Facility, Integer> facilityLinkedHashMap = read();
        Set<Facility> facilitySet = facilityLinkedHashMap.keySet();
        if (facilitySet.size() == 0) {
            System.out.println("No value");
        } else {
            for (Facility facility : facilitySet) {
                System.out.println("'" + facility + "' value: " + facilityLinkedHashMap.get(facility));
            }
        }
    }

    @Override
    public void increaseThenBooking(String idSevice, String serviceType) {
        Set<Map.Entry<Villa, Integer>> villaEntry = villaRepository.display().entrySet();
        Set<Map.Entry<House, Integer>> houseEntry = houseRepository.display().entrySet();
        Set<Map.Entry<Room, Integer>> roomEntry = roomRepository.display().entrySet();
        switch (serviceType) {
            case "Villa":
                for (Map.Entry<Villa, Integer> m : villaEntry) {
                    if (m.getKey().getIdService().equals(idSevice)) {
                        villaRepository.edit(m.getKey(), m.getValue());
                        break;
                    }
                }
            case "House":
                for (Map.Entry<House, Integer> h : houseEntry) {
                    if (h.getKey().getIdService().equals(idSevice)) {
                        houseRepository.edit(h.getKey(), h.getValue());
                        break;
                    }
                }
            case "Room":
                for (Map.Entry<Room, Integer> e : roomEntry) {
                    if (e.getKey().getIdService().equals(idSevice)) {
                        roomRepository.edit(e.getKey(), e.getValue());
                        break;
                    }
                }
        }
    }

    @Override
    public LinkedHashMap<Facility, Integer> read() {
        LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap1 = new LinkedHashMap<>();
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = villaRepository.display();
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = houseRepository.display();
        LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = roomRepository.display();
        Set<Villa> villaSet = villaIntegerLinkedHashMap.keySet();
        Set<House> houseSet = houseIntegerLinkedHashMap.keySet();
        Set<Room> roomSet = roomIntegerLinkedHashMap.keySet();
        for (Villa villa : villaSet) {
            facilityIntegerLinkedHashMap1.put(villa, villaIntegerLinkedHashMap.get(villa));
        }
        for (House house : houseSet) {
            facilityIntegerLinkedHashMap1.put(house, houseIntegerLinkedHashMap.get(house));
        }
        for (Room room : roomSet) {
            facilityIntegerLinkedHashMap1.put(room, roomIntegerLinkedHashMap.get(room));
        }
        facilityIntegerLinkedHashMap = facilityIntegerLinkedHashMap1;
        return facilityIntegerLinkedHashMap1;
    }

    @Override
    public void displaylistFacilityMaintenance() {
        read();
        Set<Facility> facilitySet = facilityIntegerLinkedHashMap.keySet();
        for (Facility facility : facilitySet) {
            if (facilityIntegerLinkedHashMap.get(facility) >= 5) {
                System.out.println(facility.getServiceName() + " need maintenance");
            }
        }
    }
}
