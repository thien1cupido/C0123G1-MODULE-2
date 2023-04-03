package case_study.service.impl;

import case_study.model.House;
import case_study.service.IHouseService;
import case_study.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl implements IHouseService {
    static Validate validate = new Validate();
    static Scanner scanner = new Scanner(System.in);
    static List<House> houseList = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Nhập id House(SVHO-XXXX): ");
        String idHouse = scanner.nextLine();
        idHouse = validate.checkRegex(idHouse, validate.getRegexIDHouse());
        System.out.print("Nhập name House: ");
        String nameHouse = scanner.nextLine();
        nameHouse = validate.checkRegex(nameHouse, validate.getRegexNameService());
        System.out.print("Nhập diện tích House: ");
        String usableAre = scanner.nextLine();
        usableAre = validate.checkRegex(usableAre, validate.getRegexServiceArea());
        System.out.print("Nhập giá cho thuê House: ");
        String rentalCosts = scanner.nextLine();
        rentalCosts = validate.checkRegex(rentalCosts, validate.getRegexRentalCost());
        System.out.print("Nhập số người tối đa trong House: ");
        String maximumNumberOfPeople = scanner.nextLine();
        maximumNumberOfPeople = validate.checkRegex(maximumNumberOfPeople, validate.getRegexNumberMaxPeoples());
        String rentalType = validate.getRentalType();
        System.out.print("Nhập tiêu chuẩn phòng House: ");
        String roomStandard = scanner.nextLine();
        roomStandard= validate.checkRegex(roomStandard, validate.getRegexStandardRoom());
        System.out.print("Nhập số tầng House: ");
        String numberOfFloors = scanner.nextLine();
        numberOfFloors = validate.checkRegex(numberOfFloors, validate.getRegexNumberOfFloors());
        houseList.add(new House(idHouse, nameHouse, Float.parseFloat(usableAre), Integer.parseInt(rentalCosts),
                Integer.parseInt(maximumNumberOfPeople), rentalType, roomStandard, Integer.parseInt(numberOfFloors)));
    }

    @Override
    public void display() {
        if (!houseList.isEmpty()) {
            for (House h : houseList) {
                System.out.println(h);
            }
        } else {
            System.out.println("Không còn house");
        }
    }

    @Override
    public void edit() {

    }

}
