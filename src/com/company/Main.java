package com.company;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 35);
        Product product2 = new Product("Молоко", 72);
        Product product3 = new Product("Смартфон", 10000);
        Product product4 = new Product("Кружка", 150);
        Product product5 = new Product("Планшет", 15000);
        Product product6 = new Product("Тарелка", 100);


        Category food = new Category("Продукты питания");
        Category dishes = new Category("Посуда");
        Category electronics = new Category("Электроника");

        food.addProduct(product1);
        food.addProduct(product2);
        dishes.addProduct(product4);
        dishes.addProduct(product6);
        electronics.addProduct(product3);
        electronics.addProduct(product5);

        System.out.println(food);
        System.out.println(dishes);
        System.out.println(electronics);

        User user1 = new User("Vasya", "147Low");
        User user2 = new User("Misha", "256Best");
        User user3 = new User("Vera", "23helloW");

        user1.toBuy(product1);
        user1.toBuy(product3);
        user1.toBuy(product6);
        user2.toBuy(product1);
        user2.toBuy(product2);
        user2.toBuy(product4);
        user2.toBuy(product3);
        user2.toBuy(product1);
        user3.toBuy(product4);
        user3.toBuy(product6);
        
        System.out.println(user1.getBasket());
        System.out.println(user2.getBasket());
        System.out.println(user3.getBasket());
    }
}
