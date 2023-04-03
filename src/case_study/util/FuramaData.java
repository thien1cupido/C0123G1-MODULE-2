package case_study.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaData {
    static Scanner scanner = new Scanner(System.in);
    static List<String> levelList = new ArrayList<>();

    static {
        levelList.add("Intermediate");
        levelList.add("College");
        levelList.add("University");
        levelList.add("After university");
    }

    static List<String> positionList = new ArrayList<>();

    static {
        positionList.add("Receptionist");
        positionList.add("Serve");
        positionList.add("Expert");
        positionList.add("Monitor");
        positionList.add("Manager");
        positionList.add("Director");
    }

    static List<String> typeCustomerList = new ArrayList<>();

    static {
        typeCustomerList.add("Diamond");
        typeCustomerList.add("Platinium");
        typeCustomerList.add("Gold");
        typeCustomerList.add("Silver");
        typeCustomerList.add("Member");
    }

    public static String getLevel() {
        String result = "";
        boolean flag;
        do {
            flag = false;
            System.out.print("Select employee position\n" +
                    "1.\tIntermediate\n" +
                    "2.\tCollege\n" +
                    "3.\tUniversity\n" +
                    "4.\tAfter university\n" +
                    "Enter selection: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Intermediate");
                    result = levelList.get(0);
                    break;
                case "2":
                    System.out.println("College");
                    result = levelList.get(1);
                    break;
                case "3":
                    System.out.println("University");
                    result = levelList.get(2);
                    break;
                case "4":
                    System.out.println("After university");
                    result = levelList.get(3);
                    break;
                default:
                    System.out.println("Enter the wrong choice, please re-enter!");
                    flag = true;
            }
        }
        while (flag);
        return result;
    }

    public static String getPositionl() {
        String result = "";
        boolean flag;
        do {
            flag = false;
            System.out.print("Choose position employee\n" +
                    "1.\tReceptionist\n" +
                    "2.\tServe\n" +
                    "3.\tExpert\n" +
                    "4.\tMonitor\n" +
                    "5.\tManage\n" +
                    "6.\tGiám đốc\n" +
                    "Enter selection: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Receptionist");
                    result = positionList.get(0);
                    break;
                case "2":
                    System.out.println("Serve");
                    result = positionList.get(1);
                    break;
                case "3":
                    System.out.println("Expert");
                    result = positionList.get(2);
                    break;
                case "4":
                    System.out.println("Monitor");
                    result = positionList.get(3);
                    break;
                case "5":
                    System.out.println("Manager");
                    result = positionList.get(4);
                    break;
                case "6":
                    System.out.println("Director");
                    result = positionList.get(5);
                    break;
                default:
                    System.out.println("Enter the wrong choice, please re-enter!");
                    flag = true;
            }
        }
        while (flag);
        return result;
    }

    public static String getCustomerType() {
        String result = "";
        boolean flag;
        do {
            flag = false;
            System.out.print("Choose customer type:\n" +
                    "1.\tDiamond\n" +
                    "2.\tPlatinium\n" +
                    "3.\tGold\n" +
                    "4.\tSilver\n" +
                    "5.\tMember\n" +
                    "Enter selection: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Diamond");
                    result = typeCustomerList.get(0);
                    break;
                case "2":
                    System.out.println("Platinium");
                    result = typeCustomerList.get(1);
                    break;
                case "3":
                    System.out.println("Gold");
                    result = typeCustomerList.get(2);
                    break;
                case "4":
                    System.out.println("Silver");
                    result = typeCustomerList.get(3);
                    break;
                case "5":
                    System.out.println("Member");
                    result = typeCustomerList.get(4);
                    break;
                default:
                    System.out.println("Enter the wrong choice, please re-enter!");
                    flag = true;
            }
        }
        while (flag);
        return result;
    }
}
