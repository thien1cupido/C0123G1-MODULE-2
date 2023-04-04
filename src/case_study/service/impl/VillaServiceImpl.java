package case_study.service.impl;


import case_study.model.Villa;
import case_study.repository.impl.VillaRepositoryImpl;
import case_study.service.IVillaService;
import case_study.util.Validate;

import java.util.*;

public class VillaServiceImpl implements IVillaService {
    static Validate validate = new Validate();
    static VillaRepositoryImpl iVillaRepository = new VillaRepositoryImpl();
    static LinkedHashMap<Villa, Integer> villaLinkedHashMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    static {
        villaLinkedHashMap = iVillaRepository.display();
    }

    @Override
    public void addVilla() {
        System.out.print("Enter id Villa (SVVL-XXXX): ");
        String idVilla = scanner.nextLine();
        idVilla = validate.checkRegex(idVilla, validate.getRegexIDVilla());
        System.out.print("Enter name Villa: ");
        String nameVilla = scanner.nextLine();
        nameVilla = validate.checkRegex(nameVilla, validate.getRegexNameService());
        System.out.print("Enter Villa area: ");
        String usableAre = scanner.nextLine();
        usableAre = validate.checkRegex(usableAre, validate.getRegexServiceArea());
        System.out.print("Enter rental cost Villa: ");
        String rentalCosts = scanner.nextLine();
        rentalCosts = validate.checkRegex(rentalCosts, validate.getRegexRentalCost());
        System.out.print("Enter maximum number of peoples Villa: ");
        String maximumNumberOfPeople = scanner.nextLine();
        maximumNumberOfPeople = validate.checkRegex(maximumNumberOfPeople, validate.getRegexNumberMaxPeoples());
        String rentalType = validate.getRentalType();
        System.out.print("Enter standard Villa: ");
        String roomStandard = scanner.nextLine();
        roomStandard = validate.checkRegex(roomStandard, validate.getRegexStandardRoom());
        System.out.print("Enter swimming pool area Villa: ");
        String swimmingPoolArea = scanner.nextLine();
        roomStandard = validate.checkRegex(swimmingPoolArea, validate.getRegexSwimmingPoolArea());
        System.out.print("Enter number of floors Villa: ");
        String numberOfFloors = scanner.nextLine();
        numberOfFloors = validate.checkRegex(numberOfFloors, validate.getRegexNumberOfFloors());
        iVillaRepository.add(new Villa(idVilla, nameVilla, Float.parseFloat(usableAre), Integer.parseInt(rentalCosts),
                Integer.parseInt(maximumNumberOfPeople), rentalType, roomStandard, Float.parseFloat(swimmingPoolArea), Integer.parseInt(numberOfFloors)), 0);
    }

    @Override
    public void displayVilla() {
        Set<Villa> villaSet = villaLinkedHashMap.keySet();
        if (villaLinkedHashMap != null) {
            for (Villa villa : villaSet) {
                System.out.println(villa +" value: "+villaLinkedHashMap.get(villa));
            }
        } else {
            System.out.println("There are no more villas in the list");
        }
    }
}
