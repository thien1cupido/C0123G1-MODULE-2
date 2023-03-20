package ss12_map_tree.bai_tap.bai_1.service.imp;

import ss12_map_tree.bai_tap.bai_1.model.Product;

import java.util.Comparator;

public class SortByPriceDecrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()- o1.getPrice());
    }
}
