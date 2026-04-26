package org.example.design.factory.factorymethod;

public class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Burger with double patty, bacon, avocado, and special sauce.");
    }
}
