package org.example.design.factory.abstractFactoryMethod;

public class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with patty, lettuce, tomato, and cheese.");
    }
}
