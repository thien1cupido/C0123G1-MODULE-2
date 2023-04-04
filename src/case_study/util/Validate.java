package case_study.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validate {
    private String regexIDVilla = "^SVVL-\\d{4}$";
    private String regexIDHouse = "^SVHO-\\d{4}$";
    private String regexIDRoom = "^SVRO-\\d{4}$";
    private String regexNameService = "^[A-Z][a-z]{1,}$";
    private String regexRentalCost = "^[1-9]{1,}(\\.\\d{1,2})?$";
    private String regexNumberOfFloors = "^\\d{1,}$";
    private String regexNumberMaxPeoples = "^[1-9]|(1[0-9])$";
    private String regexServiceArea = "^3[0-9](\\.\\d{1,2})?|[4-9][0-9](\\.\\d{1,2})?|[1-9][0-9]{2,}(\\.\\d{1,2})?$";
    private String regexRentalType = "^\\d{1,}$";
    private String regexStandardRoom = "^[A-Z][a-z]{1,}$";
    private String regexSwimmingPoolArea = "^[1-9]{1,}(\\.\\d{1,2})?$";
    private String regexBirthOfDay = "^((0[1-9])|([1-2][0-9])|(3[0-1]))\\/((0[1-9])|(1[0-2]))\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";

    static List<String> rentalTypeList = new ArrayList<>();

    static {
        rentalTypeList.add("year");
        rentalTypeList.add("month");
        rentalTypeList.add("day");
        rentalTypeList.add("hour");
    }
//    public boolean check(String s){
//        String regexRentalCost = "^((0[1-9])|([1-2][0-9])|(3[0-1]))\\/((0[1-9])|(1[0-2]))\\/((19([2-9][4-9]))|(20([0-4][0-9]|5[0-5])))$";
//        return s.matches(regexRentalCost);
//    }

    public String getRegexBirthOfDay() {
        return regexBirthOfDay;
    }

    public String getRegexSwimmingPoolArea() {
        return regexSwimmingPoolArea;
    }

    public String getRegexRentalType() {
        return regexRentalType;
    }

    public String getRegexStandardRoom() {
        return regexStandardRoom;
    }

    public String getRegexNumberOfFloors() {
        return regexNumberOfFloors;
    }

    public String getRegexNumberMaxPeoples() {
        return regexNumberMaxPeoples;
    }

    public String getRegexRentalCost() {
        return regexRentalCost;
    }

    public String getRegexIDVilla() {
        return regexIDVilla;
    }

    public String getRegexIDHouse() {
        return regexIDHouse;
    }

    public String getRegexIDRoom() {
        return regexIDRoom;
    }

    public String getRegexNameService() {
        return regexNameService;
    }

    public String getRegexServiceArea() {
        return regexServiceArea;
    }

    static Scanner scanner = new Scanner(System.in);

    public String checkRegex(String idService, String regex) {
        boolean flag;
        String nhapLai;
        if (idService.matches(regex)) {
            return idService;
        } else {
            do {
                flag = true;
                System.out.println("Enter the wrong format, please re-enter!");
                System.out.print("Re-enter:");
                nhapLai = scanner.nextLine();
                if (nhapLai.matches(regex)) {
                    flag = false;
                }
            } while (flag);
            return nhapLai;
        }
    }

    public String getRentalType() {
        Validate validate = new Validate();
        String result = "";
        boolean flag;
        do {
            flag = false;
            System.out.print("Selection rental type\n" +
                    "1.\tBy year\n" +
                    "2.\tBy month\n" +
                    "3.\tBy day\n" +
                    "4.\tBy hour\n" +
                    "Enter the choice: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("By year");
                    System.out.print("Enter number year: ");
                    String rentalType1 = scanner.nextLine();
                    rentalType1 = validate.checkRegex(rentalType1, regexRentalType);
                    result = rentalType1 + " " + rentalTypeList.get(0);
                    break;
                case "2":
                    System.out.println("By month");
                    System.out.print("Enter number month: ");
                    String rentalType2 = scanner.nextLine();
                    rentalType2 = validate.checkRegex(rentalType2, regexRentalType);
                    result = rentalType2 + " " + rentalTypeList.get(1);
                    break;
                case "3":
                    System.out.println("By day");
                    System.out.print("Enter number day: ");
                    String rentalType3 = scanner.nextLine();
                    rentalType3 = validate.checkRegex(rentalType3, regexRentalType);
                    result = rentalType3 + " " + rentalTypeList.get(2);
                    break;
                case "4":
                    System.out.println("By hour");
                    System.out.print("Enter number hour: ");
                    String rentalType4 = scanner.nextLine();
                    rentalType4 = validate.checkRegex(rentalType4, regexRentalType);
                    result = rentalType4 + " " + rentalTypeList.get(3);
                    break;
                default:
                    System.out.print("Enter the wrong selection, please re-enter! ");
                    flag = true;
            }
        }
        while (flag);
        return result;
    }
}
