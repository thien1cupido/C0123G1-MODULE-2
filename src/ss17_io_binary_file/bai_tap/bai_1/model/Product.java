package ss17_io_binary_file.bai_tap.bai_1.model;

import java.awt.*;
import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private float price;
    private String manufacturedGoods;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, float price, String manufacturedGoods, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturedGoods = manufacturedGoods;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturedGoods() {
        return manufacturedGoods;
    }

    public void setManufacturedGoods(String manufacturedGoods) {
        this.manufacturedGoods = manufacturedGoods;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturedGoods='" + manufacturedGoods + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return this.id+","+this.name+","+this.price+","+this.manufacturedGoods+","+this.describe;
    }
}