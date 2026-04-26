package org.example.design.factory.simple;

public class RegularBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Regular Burger with patty, lettuce, tomato, and cheese.");
    }
}
