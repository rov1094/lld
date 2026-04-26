package org.example.design.factory.factorymethod.healthyBurger;

import org.example.design.factory.factorymethod.Burger;

public class BasicWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Wheat Burger with whole wheat bun, patty, lettuce, tomato, and cheese.");
    }
}
