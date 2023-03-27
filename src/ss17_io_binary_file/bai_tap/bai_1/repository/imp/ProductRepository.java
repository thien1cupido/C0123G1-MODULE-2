package ss17_io_binary_file.bai_tap.bai_1.repository.imp;

import ss17_io_binary_file.bai_tap.bai_1.model.Product;
import ss17_io_binary_file.bai_tap.bai_1.repository.IProductRepository;
import ss17_io_binary_file.bai_tap.bai_1.ulti.ReadAndWrite;

import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PATH_FILE = "src\\ss17_io_binary_file\\bai_tap\\bai_1\\data\\data_product.dat";

    @Override
    public List<Product> getAll() {
        List<Product> productList=ReadAndWrite.readFileBinary(PATH_FILE);
        return productList;
    }

    public void add(Product product) {
        List<Product> productList=ReadAndWrite.readFileBinary(PATH_FILE);
        productList.add(product);
        ReadAndWrite.writeListStudentToFile(PATH_FILE,productList);
    }

    @Override
    public void search(String name) {
        List<Product> productList =ReadAndWrite.readFileBinary(PATH_FILE);
        boolean flag=true;
        for (Product p:productList) {
            if (name.toLowerCase().equals(p.getName().toLowerCase())) {
                System.out.println(p);
                flag = false;
            }
        }
        if (flag){
            System.out.println("Không tìm thấy");
        }
    }
}
