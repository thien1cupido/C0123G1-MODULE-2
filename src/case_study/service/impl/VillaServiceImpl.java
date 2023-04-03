package case_study.service.impl;


import case_study.model.Villa;
import case_study.repository.impl.VillaRepositoryImpl;
import case_study.service.IVillaService;
import case_study.util.ReadAndReadVilla;
import case_study.util.Validate;

import java.util.*;

public class VillaServiceImpl implements IVillaService {
    static Validate validate = new Validate();
    private static final String PATH_FILE = "src\\case_study\\data\\villa_data.csv";
    static VillaRepositoryImpl iVillaRepository = new VillaRepositoryImpl();
    static LinkedHashMap<Villa, Integer> villaLinkedHashMap = new LinkedHashMap<>();

    static {
        villaLinkedHashMap = ReadAndReadVilla.readFileToVilla(PATH_FILE);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addVilla() {
        System.out.print("Nhập id Villa (SVVL-XXXX): ");
        String idVilla = scanner.nextLine();
        idVilla = validate.checkRegex(idVilla, validate.getRegexIDVilla());
        System.out.print("Nhập name Villa: ");
        String nameVilla = scanner.nextLine();
        nameVilla = validate.checkRegex(nameVilla, validate.getRegexNameService());
        System.out.print("Nhập diện tích Villa: ");
        String usableAre = scanner.nextLine();
        usableAre = validate.checkRegex(usableAre, validate.getRegexServiceArea());
        System.out.print("Nhập giá cho thuê Villa: ");
        String rentalCosts = scanner.nextLine();
        rentalCosts = validate.checkRegex(rentalCosts, validate.getRegexRentalCost());
        System.out.print("Nhập số người tối đa trong Villa: ");
        String maximumNumberOfPeople = scanner.nextLine();
        maximumNumberOfPeople = validate.checkRegex(maximumNumberOfPeople, validate.getRegexNumberMaxPeoples());
        String rentalType = validate.getRentalType();
        System.out.print("Nhập tiêu chuẩn phòng Villa: ");
        String roomStandard = scanner.nextLine();
        roomStandard = validate.checkRegex(roomStandard, validate.getRegexStandardRoom());
        System.out.print("Nhập diện tích hồ bơi Villa: ");
        String swimmingPoolArea = scanner.nextLine();
        roomStandard = validate.checkRegex(swimmingPoolArea, validate.getRegexSwimmingPoolArea());
        System.out.print("Nhập số tầng trong Villa: ");
        String numberOfRoom = scanner.nextLine();
        numberOfRoom = validate.checkRegex(numberOfRoom, validate.getRegexNumberOfFloors());
        villaLinkedHashMap.put(new Villa(idVilla, nameVilla, Float.parseFloat(usableAre), Integer.parseInt(rentalCosts),
                Integer.parseInt(maximumNumberOfPeople), rentalType, roomStandard, Float.parseFloat(swimmingPoolArea), Integer.parseInt(numberOfRoom)), 0);
        iVillaRepository.add(villaLinkedHashMap);
    }

    @Override
    public LinkedHashMap<Villa, Integer> displayVilla() {
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = ReadAndReadVilla.readFileToVilla(PATH_FILE);
        return villaIntegerLinkedHashMap;
    }
}
