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
    static IRoomRepository roomRepository = new RoomRepositoryImpl();
    static IHouseRepository houseRepository = new HouseRepositoryImpl();
    static IVillaRepository villaRepository = new VillaRepositoryImpl();
    static IVillaService villaService = new VillaServiceImpl();
    static IHouseService houseService = new HouseServiceImpl();
    static IRoomService roomService = new RoomServiceImpl();
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
        read();
        Set<Facility> facilitySet = facilityIntegerLinkedHashMap.keySet();
        for (Facility facility : facilitySet) {
            System.out.println("'"+facility+"' value: "+facilityIntegerLinkedHashMap.get(facility));
        }
    }

    @Override
    public void edit(String idSevice) {
        LinkedHashMap<Facility,Integer>linkedHashMap=read();
//       Set<Facility> facilitySet= linkedHashMap.keySet();
//        for (Facility s:facilitySet) {
//            if (idSevice.equals(s.getIdService())){
//                linkedHashMap.
//            }
//        }
        for (int i = 0; i < linkedHashMap.size(); i++) {
            Facility facility=(Facility) linkedHashMap.keySet().toArray()[i];
            int value =(int) linkedHashMap.values().toArray()[i];
            if (facility.getIdService().equals(idSevice)){
                linkedHashMap.
            }
        }
    }

    @Override
    public LinkedHashMap<Facility, Integer> read() {
        Set<Villa> villaSet = villaRepository.display().keySet();
        Set<House> houseSet = houseRepository.display().keySet();
        Set<Room> roomSet = roomRepository.display().keySet();
        for (Villa villa : villaSet) {
            facilityIntegerLinkedHashMap.put(villa, villaRepository.display().get(villa));
        }
        for (House house : houseSet) {
            facilityIntegerLinkedHashMap.put(house, houseRepository.display().get(house));
        }
        for (Room room : roomSet) {
            facilityIntegerLinkedHashMap.put(room, roomRepository.display().get(room));
        }
        return facilityIntegerLinkedHashMap;
    }

    @Override
    public void displaylistFacilityMaintenance() {
        read();
        Set<Facility> facilitySet=facilityIntegerLinkedHashMap.keySet();
        for (Facility facility:facilitySet) {
            if (facilityIntegerLinkedHashMap.get(facility)>=5){
                System.out.println(facility.getServiceName()+" need maintenance");
            }
        }
    }
}
