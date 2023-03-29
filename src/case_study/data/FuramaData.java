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
            flag = true;
            System.out.print("Lựa chọn vị trí nhân viên" +
                    "1.\tTrung Cấp" +
                    "2.\tCao Đẳng" +
                    "3.\tĐại Học" +
                    "4.\tSau Đại Học" +
                    "Nhập lựa chọn");
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
                    flag = false;
            }
        }
        while (flag);
        return result;
    }

    public static String getPositionl() {
        String result = "";
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn vị trí nhân viên" +
                    "1.\tLễ tân" +
                    "2.\tPhục vụ" +
                    "3.\tChuyên viên" +
                    "4.\tGiám sát" +
                    "5.\tQuản lý" +
                    "6.\tGiám đốc" +
                    "Nhập lựa chọn");
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
                    flag = false;
            }
        }
        while (flag);
        return result;
    }

    public static String getCustomerType() {
        String result = "";
        boolean flag;
        do {
            flag = true;
            System.out.print("Lựa chọn vị trí nhân viên" +
                    "1.\tDiamond" +
                    "2.\tPlatinium" +
                    "3.\tSilver" +
                    "4.\tMember" +
                    "Nhập lựa chọn");
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
                    System.out.println("Silver");
                    result = typeCustomerList.get(2);
                    break;
                case "4":
                    System.out.println("Member");
                    result = typeCustomerList.get(3);
                    break;
                default:
                    System.out.println("Nhập sai,mời nhập lại");
                    flag = false;
            }
        }
        while (flag);
        return result;
    }
}
