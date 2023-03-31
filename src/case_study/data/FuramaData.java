package case_study.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaData {
    static Scanner scanner = new Scanner(System.in);
    static List<String> levelList = new ArrayList<>();

    static {
        levelList.add("Trung Cấp");
        levelList.add("Cao Đẳng");
        levelList.add("Đại Học");
        levelList.add("Sau Đại Học");
    }

    static List<String> positionList = new ArrayList<>();

    static {
        positionList.add("Lễ tân");
        positionList.add("Phục vụ");
        positionList.add("Chuyên viên");
        positionList.add("Giám sát");
        positionList.add("Quản lý");
        positionList.add("Giám đốc");
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
            System.out.print("Lựa chọn vị trí nhân viên\n" +
                    "1.\tTrung Cấp\n" +
                    "2.\tCao Đẳng\n" +
                    "3.\tĐại Học\n" +
                    "4.\tSau Đại Học\n" +
                    "Nhập lựa chọn: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Trung Cấp");
                    result = levelList.get(0);
                    break;
                case "2":
                    System.out.println("Cao Đẳng");
                    result = levelList.get(1);
                    break;
                case "3":
                    System.out.println("Đại Học");
                    result = levelList.get(2);
                    break;
                case "4":
                    System.out.println("Sau Đại Học");
                    result = levelList.get(3);
                    break;
                default:
                    System.out.println("Nhập sai,mời nhập lại");
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
            System.out.print("Lựa chọn vị trí nhân viên\n" +
                    "1.\tLễ tân\n" +
                    "2.\tPhục vụ\n" +
                    "3.\tChuyên viên\n" +
                    "4.\tGiám sát\n" +
                    "5.\tQuản lý\n" +
                    "6.\tGiám đốc\n" +
                    "Nhập lựa chọn: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Lễ tân");
                    result = positionList.get(0);
                    break;
                case "2":
                    System.out.println("Phục vụ");
                    result = positionList.get(1);
                    break;
                case "3":
                    System.out.println("Chuyên viên");
                    result = positionList.get(2);
                    break;
                case "4":
                    System.out.println("Giám sát");
                    result = positionList.get(3);
                    break;
                case "5":
                    System.out.println("Quản lý");
                    result = positionList.get(4);
                    break;
                case "6":
                    System.out.println("Giám đốc");
                    result = positionList.get(5);
                    break;
                default:
                    System.out.println("Nhập sai,mời nhập lại");
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
            System.out.print("Lựa chọn vị trí nhân viên\n" +
                    "1.\tDiamond\n" +
                    "2.\tPlatinium\n" +
                    "3.\tGold\n" +
                    "4.\tSilver\n" +
                    "5.\tMember\n" +
                    "Nhập lựa chọn: ");
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
                    System.out.println("Nhập sai,mời nhập lại");
                    flag = true;
            }
        }
        while (flag);
        return result;
    }
}
