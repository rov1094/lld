package org.example.design.factory.simple;

public class Customer {

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        orderBurger(burgerFactory, "regular");
        orderBurger(burgerFactory, "premium");
        orderBurger(burgerFactory, "standard");

    }

    public static void orderBurger(BurgerFactory burgerFactory, String type) {
        Burger burger = burgerFactory.createBurger(type);
        burger.prepare();
    }
}
