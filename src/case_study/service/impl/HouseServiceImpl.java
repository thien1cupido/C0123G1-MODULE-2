package case_study.service.impl;

import case_study.model.House;
import case_study.repository.IHouseRepository;
import case_study.repository.impl.HouseRepositoryImpl;
import case_study.service.IHouseService;
import case_study.util.Validate;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class HouseServiceImpl implements IHouseService {
    static Validate validate = new Validate();
    static Scanner scanner = new Scanner(System.in);
    static IHouseRepository houseRepository=new HouseRepositoryImpl();
    static LinkedHashMap<House,Integer>houseIntegerLinkedHashMap=new LinkedHashMap<>();
    static {
        houseIntegerLinkedHashMap=houseRepository.display();
    }

    @Override
    public void addHouse() {
        System.out.print("Enter id House(SVHO-XXXX): ");
        String idHouse = scanner.nextLine();
        idHouse = validate.checkRegex(idHouse, validate.getRegexIDHouse());
        System.out.print("Enter name House: ");
        String nameHouse = scanner.nextLine();
        nameHouse = validate.checkRegex(nameHouse, validate.getRegexNameService());
        System.out.print("Enter House area: ");
        String usableAre = scanner.nextLine();
        usableAre = validate.checkRegex(usableAre, validate.getRegexServiceArea());
        System.out.print("Enter rental costs House: ");
        String rentalCosts = scanner.nextLine();
        rentalCosts = validate.checkRegex(rentalCosts, validate.getRegexRentalCost());
        System.out.print("Enter maximum number of peoples House: ");
        String maximumNumberOfPeople = scanner.nextLine();
        maximumNumberOfPeople = validate.checkRegex(maximumNumberOfPeople, validate.getRegexNumberMaxPeoples());
        String rentalType = validate.getRentalType();
        System.out.print("Enter standard room in House: ");
        String roomStandard = scanner.nextLine();
        roomStandard= validate.checkRegex(roomStandard, validate.getRegexStandardRoom());
        System.out.print("Enter number of floos House: ");
        String numberOfFloors = scanner.nextLine();
        numberOfFloors = validate.checkRegex(numberOfFloors, validate.getRegexNumberOfFloors());
        houseRepository.add(new House(idHouse, nameHouse, Float.parseFloat(usableAre), Integer.parseInt(rentalCosts),
                Integer.parseInt(maximumNumberOfPeople), rentalType, roomStandard, Integer.parseInt(numberOfFloors)),0);
        System.out.println("more success");
    }

    @Override
    public void displayHouse() {
        Set<House> houseList=houseIntegerLinkedHashMap.keySet();
        if (houseList!=null) {
            for (House h : houseList) {
                System.out.println(h+" value: "+houseIntegerLinkedHashMap.get(h));
            }
        } else {
            System.out.println("There are no more houses in the list");
        }
    }
}
