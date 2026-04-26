package org.example.design.factory.abstractFactoryMethod;

public class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Burger with double patty, bacon, avocado, and special sauce.");
    }
}
