package org.example.design.factory.abstractFactoryMethod.healthyBurger;

import org.example.design.factory.abstractFactoryMethod.Burger;

public class BasicWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Wheat Burger with whole wheat bun, patty, lettuce, tomato, and cheese.");
    }
}
