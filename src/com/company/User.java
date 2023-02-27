package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private Basket basket = new Basket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public Basket toBuy(Product product) {
        basket.getProductList().add(product);
        return basket;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(User.class)) return false;
        User user = (User) obj;
        return this.password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }
    @Override
    public String toString() {
        return login;
    }
}
