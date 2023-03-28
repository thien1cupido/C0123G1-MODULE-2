package ss17_io_binary_file.bai_tap.bai_1.service.imp;

import ss17_io_binary_file.bai_tap.bai_1.model.Product;
import ss17_io_binary_file.bai_tap.bai_1.repository.imp.ProductRepository;
import ss17_io_binary_file.bai_tap.bai_1.service.IProductService;
import ss17_io_binary_file.bai_tap.bai_1.ulti.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    static ProductRepository productRepository = new ProductRepository();
    static Scanner scanner = new Scanner(System.in);
    private static final String PATH_FILE = "src\\ss17_io_binary_file\\bai_tap\\bai_1\\data\\data_product.dat";
    static List<Product> productList = new ArrayList<>();

    static {
        productList = ReadAndWrite.readFileBinary(PATH_FILE);
    }


    @Override
    public void add() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập hàng sản xuất: ");
        String manufacturedGoods = scanner.nextLine();
        System.out.print("Mô tả: ");
        String describe = scanner.nextLine();
        productList.add(new Product(id, name, price, manufacturedGoods, describe));
        productRepository.add(productList);
    }

    @Override
    public void display() {
        for (Product p : productList
        ) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        System.out.print("Nhập tên muốn tìm: ");
        String name = scanner.nextLine();
        productRepository.search(productList, name.trim());
    }
}
