package ss12_map_tree.bai_tap.bai_1.service.imp;

import ss12_map_tree.bai_tap.bai_1.model.Product;
import ss12_map_tree.bai_tap.bai_1.service.IServiceProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct {
    static ArrayList<Product> arrayList = new ArrayList<>();

    static {
        arrayList.add(new Product(0, "IphoneXS", 7.5f));
        arrayList.add(new Product(2, "Iphone14", 30f));
        arrayList.add(new Product(1, "Iphone12", 12f));
    }

    Scanner scanner = new Scanner(System.in);
    boolean flag;

    @Override
    public void add() {
        System.out.println("Thêm mới sản phẩm");
        int count = 0;
        int id;
        do {
            flag = true;
            System.out.print("Nhập id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Product product : arrayList) {
                if (id == product.getId()) {
                    System.out.println("Id đã trùng vui lòng nhập lại");
                    flag = false;
                } else {
                    count++;
                }
            }
        } while (!flag);
        if (count == arrayList.size()) {
            System.out.print("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            float price = Float.parseFloat(scanner.nextLine());
            arrayList.add(new Product(id, name, price));
        }
    }

    @Override
    public void update() {
        do {
            flag = true;
            System.out.println("Lựa chọn cách sửa:\n" +
                    "1.Sửa từng thông tin\n" +
                    "2.Sửa toàn bộ thông tin\n" +
                    "3.Thoát\n" +
                    "Nhập lựa chọn: ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("Sửa từng thông tin");
                    updatePart();
                    break;
                case 2:
                    System.out.println("Sửa từng thông tin");
                    updateTotal();
                    break;
                case 3:
                    System.out.println("Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        } while (flag);
    }


    @Override
    public void display() {
        if (arrayList.size() != 0) {
            for (Product p : arrayList) {
                System.out.println(p);
            }
        } else {
            System.out.println("Không còn sản phẩm nào");
        }
    }

    @Override
    public void delect() {
        int id;
        do {
            flag = false;
            System.out.print("Nhập Id bạn muốn xóa: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Product product : arrayList) {
                if (id == product.getId()) {
                    System.out.println("Bạn có muốn xóa sản phẩm'" + product.getName() + "' không");
                    System.out.print("Nhập 'có' hoặc 'không' để xác nhận: ");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "có":
                            arrayList.remove(product);
                            System.out.println("Đã xóa sản phẩm có ID là " + id + " khỏi danh sách.");
                            flag = true;
                            break;
                        case "không":
                            flag = true;
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                }
            }
            if (!flag) {
                if (arrayList.size() == 0) {
                    System.out.println("Không còn sản phẩm ở trong danh sách để xóa");
                    return;
                } else {
                    System.out.println("Không có sản phẩm có ID là " + id + " trong danh sách. Vui lòng nhập lại.");
                }
            }
        } while (!flag);
    }

    @Override
    public void search() {
        System.out.print("Nhập vào tên tìm kiếm: ");
        String search = scanner.next();
        for (Product product : arrayList) {
            if (product.getName().equals(search)) {
                System.out.println(product);
            } else {
                System.out.println("Không có sản phẩm ở trong danh sách");
            }
        }

    }

    @Override
    public void sort() {
        do {
            flag = true;
            System.out.println("Sắp xếp theo thứ tự:\n" +
                    "1.Giá tăng dần\n" +
                    "2.Giá giảm dần\n" +
                    "3.Thoát\n" +
                    "Nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Giá sắp xếp tăng dần");
                    arrayList.sort(new SortByPriceIcrease());
                    for (Product product : arrayList) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.println("Giá sắp xếp giảm dần");
                    arrayList.sort(new SortByPriceDecrease());
                    for (Product product : arrayList) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.println("Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (flag);
    }

    public void updatePart() {
        System.out.println("Nhập Id của học sinh bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : arrayList) {
            if (id == product.getId()) {
                System.out.println(product.toString());
                int menu;
                do {
                    flag = true;
                    System.out.println("1.Sửa tên\n" +
                            "2.Sửa giá\n" +
                            "3.Thoát");
                    System.out.print("Lựa chọn thông tin của sản phẩm cần sửa: ");
                    menu = Integer.parseInt(scanner.nextLine());
                    switch (menu) {
                        case 1:
                            System.out.print("Sửa tên sản phẩm " + product.getName() + ": ");
                            String updateName = scanner.nextLine();
                            product.setName(updateName);
                            break;
                        case 2:
                            System.out.print("Sửa giá sản phẩm " + product.getName() + ": ");
                            float updatePrice = Float.parseFloat(scanner.nextLine());
                            product.setPrice(updatePrice);
                            break;
                        case 3:
                            System.out.println("Thoát");
                            flag = false;
                            break;
                        default:
                            System.out.println("Nhập sai lựa chọn, xin mời nhập lại");
                    }
                } while (flag);
            }
        }
    }

    public void updateTotal() {
        System.out.println("Nhập Id của học sinh bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : arrayList) {
            if (id == product.getId()) {
                System.out.println(product.toString());
                System.out.print("Sửa tên '" + product.getName() + "': ");
                String updateName = scanner.nextLine();
                product.setName(updateName);
                System.out.print("Sửa giá '" + product.getName() + "': ");
                float updatePrice = Float.parseFloat(scanner.nextLine());
                product.setPrice(updatePrice);
            }
            System.out.println(product.toString());
        }
    }
}
