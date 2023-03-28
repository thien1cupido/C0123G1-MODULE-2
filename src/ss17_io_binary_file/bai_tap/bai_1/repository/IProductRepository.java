package ss17_io_binary_file.bai_tap.bai_1.repository;

import ss17_io_binary_file.bai_tap.bai_1.model.Product;

import java.util.List;

public interface IProductRepository {

    void add(List<Product> productList);

    List<Product> display();

    void search(List<Product> productList, String name);
}
