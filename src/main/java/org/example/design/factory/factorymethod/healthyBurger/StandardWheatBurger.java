package org.example.design.factory.factorymethod.healthyBurger;

import org.example.design.factory.factorymethod.Burger;

public class StandardWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Wheat Burger with whole wheat bun, lean patty, lettuce, tomato, and avocado.");
    }
}
