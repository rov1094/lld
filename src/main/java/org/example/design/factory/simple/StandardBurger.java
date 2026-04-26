package org.example.design.factory.simple;

public class StandardBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Burger with patty, lettuce, tomato, and cheese.");
    }
}
