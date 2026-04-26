package org.example.design.factory.abstractFactoryMethod;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Welcome to King Burger! What type of burger would you like to order? (basic/standard)");
        Factory burgerFactory = new KingBurgerFactory();

        Burger basicBurger = burgerFactory.createBurger("basic");
        basicBurger.prepare();

        Burger standardBurger = burgerFactory.createBurger("standard");
        standardBurger.prepare();

        System.out.println("\nWelcome to Singh Burger! What type of burger would you like to order? (basic/standard/deluxe)");
        Factory singhBurgerFactory = new SinghBurgerFactory();
        Burger basicBurger2 = singhBurgerFactory.createBurger("basic");
        basicBurger2.prepare();
        Burger premiumBurger2 = singhBurgerFactory.createBurger("premium");
        premiumBurger2.prepare();

        System.out.println("\nWelcome to King Burger! What type of garlic bread would you like to order? (basic/wheatbasic)");
        GarlicBread basicGarlicBread = burgerFactory.createGarlicBread("basic");
        basicGarlicBread.prepare();

        GarlicBread wheatBasicGarlicBread = burgerFactory.createGarlicBread("wheatbasic");
        wheatBasicGarlicBread.prepare();

        System.out.println("\nWelcome to Singh Burger! What type of garlic bread would you like to order? (basic/wheatbasic)");
        GarlicBread basicGarlicBread2 = singhBurgerFactory.createGarlicBread("basic");
        basicGarlicBread2.prepare();

        GarlicBread wheatBasicGarlicBread2 = singhBurgerFactory.createGarlicBread("wheatbasic");
        wheatBasicGarlicBread2.prepare();
    }
}
