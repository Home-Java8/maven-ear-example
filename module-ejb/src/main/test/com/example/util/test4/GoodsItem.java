package com.example.util.test4;

public class GoodsItem {

    String name;
    float price;

    public GoodsItem(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodsItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}