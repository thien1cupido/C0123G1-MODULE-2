package ss12_map_tree.bai_tap.bai_1.service.imp;

import ss12_map_tree.bai_tap.bai_1.model.Product;

import java.util.Comparator;

public class SortByPriceIcrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}
