package org.example.design.factory.abstractFactoryMethod.healthyBurger;

import org.example.design.factory.abstractFactoryMethod.Burger;

public class StandardWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Wheat Burger with whole wheat bun, lean patty, lettuce, tomato, and avocado.");
    }
}
