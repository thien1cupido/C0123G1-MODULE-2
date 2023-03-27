package ss17_io_binary_file.bai_tap.bai_1.service.imp;

import ss17_io_binary_file.bai_tap.bai_1.model.Product;
import ss17_io_binary_file.bai_tap.bai_1.repository.imp.ProductRepository;
import ss17_io_binary_file.bai_tap.bai_1.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository =new ProductRepository();
    Scanner scanner=new Scanner(System.in);
    @Override
    public void add() {
        System.out.print("Nhập id: ");
        int id =Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name =scanner.nextLine();
        System.out.print("Nhập giá: ");
        float price=Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập hàng sản xuất: ");
        String manufacturedGoods=scanner.nextLine();
        System.out.print("Mô tả: ");
        String describe=scanner.nextLine();
        productRepository.add(new Product(id,name,price,manufacturedGoods,describe));
    }

    @Override
    public void display() {
        List<Product> productList=productRepository.getAll();
        for (Product p:productList
             ) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        System.out.print("Nhập tên muốn tìm: ");
        String name=scanner.nextLine();
        productRepository.search(name.trim());
    }
}
