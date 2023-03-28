package ss17_io_binary_file.bai_tap.bai_1.repository.imp;

import ss17_io_binary_file.bai_tap.bai_1.model.Product;
import ss17_io_binary_file.bai_tap.bai_1.repository.IProductRepository;
import ss17_io_binary_file.bai_tap.bai_1.ulti.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PATH_FILE = "src\\ss17_io_binary_file\\bai_tap\\bai_1\\data\\data_product.dat";
    static List<Product> productList = new ArrayList<>();

    @Override
    public void add(List<Product> productList) {
        ReadAndWrite.writeListStudentToFile(PATH_FILE, productList);
    }


    @Override
    public void search(List<Product> productList, String name) {
        boolean flag = true;
        for (Product p : productList) {
            if (name.toLowerCase().equals(p.getName().toLowerCase())) {
                System.out.println(p);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy");
        }
    }
}
