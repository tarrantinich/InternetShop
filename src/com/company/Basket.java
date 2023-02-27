package com.company;
import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public String toString() {
        StringBuilder stb = new StringBuilder();
        for (Product i : productList) {
            stb.append(i).append(String.format(" - ")).append(i.getPrice()).append("\n");
        }
        return stb.toString();
    }
}
