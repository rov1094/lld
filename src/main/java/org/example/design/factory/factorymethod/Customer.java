package org.example.design.factory.factorymethod;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Welcome to King Burger! What type of burger would you like to order? (basic/standard)");
        BurgerFactory burgerFactory = new KingBurgerFactory();

        Burger basicBurger = burgerFactory.createBurger("basic");
        basicBurger.prepare();

        Burger standardBurger = burgerFactory.createBurger("standard");
        standardBurger.prepare();

        System.out.println("\nWelcome to Singh Burger! What type of burger would you like to order? (basic/standard/deluxe)");
        BurgerFactory singhBurgerFactory = new SinghBurgerFactory();
        Burger basicBurger2 = singhBurgerFactory.createBurger("basic");
        basicBurger2.prepare();
        Burger premiumBurger2 = singhBurgerFactory.createBurger("premium");
        premiumBurger2.prepare();
    }
}
