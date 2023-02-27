package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public ArrayList<Product> addProduct(Product product) {
        products.add(product);
        return products;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Category.class)) return false;
        Category category = (Category) obj;
        return this.name.equals(category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        StringBuilder stb = new StringBuilder(name + ":" + "\n");
        for (Product i : products) {
            stb.append(i).append(String.format(" - ")).append(i.getPrice()).append("\n");
        }
        return stb.toString();
    }
}
