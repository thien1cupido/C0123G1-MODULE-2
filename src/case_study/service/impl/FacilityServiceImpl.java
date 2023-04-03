package case_study.service.impl;

import case_study.model.Facility;
import case_study.model.Villa;
import case_study.service.IFacilityService;
import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static final String PATH_FILE="src\\case_study\\data\\villa_data.csv";
    static LinkedHashMap<Facility,Integer>facilityIntegerLinkedHashMap=new LinkedHashMap<>();
    static IVillaService villaService=new VillaServiceImpl();
    static IHouseService houseService=new HouseServiceImpl();
    static IRoomService roomService=new RoomServiceImpl();
    Scanner scanner =new Scanner(System.in);
    @Override
    public void add() {
        boolean flag;
        String choose;
        do {
            flag = true;
            System.out.print("Lựa chọn chức năng:\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "Nhập lựa chọn: ");
            choose= scanner.nextLine();
            switch (choose){
                case "1":
                    System.out.println("Add New Villa");
                    villaService.addVilla();
                    break;
                case "2":
                    System.out.println("Add New House");
                    houseService.add();
                    break;
                case "3":
                    System.out.println("Add New Room");
                    roomService.add();
                    break;
                case "4":
                    System.out.println("Back to menu");
                    flag=false;
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn, vui lòng nhập lại");
            }
        }while (flag);
    }

    @Override
    public void display() {
        LinkedHashMap<Villa,Integer> linkedHashMap=villaService.displayVilla();
        Set<Villa>villaSet=linkedHashMap.keySet();
        for (Villa v: villaSet
             ) {
            System.out.println(v);
        }
    }

    @Override
    public void edit() {
    }

    @Override
    public void displaylistFacilityMaintenance() {

    }
}
