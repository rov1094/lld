package org.example.design.factory.simple;

public class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Burger with double patty, lettuce, tomato, cheese, and bacon.");
    }
}
