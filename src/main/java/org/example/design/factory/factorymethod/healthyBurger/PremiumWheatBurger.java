package org.example.design.factory.factorymethod.healthyBurger;

import org.example.design.factory.factorymethod.Burger;

public class PremiumWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Wheat Burger with whole wheat bun, organic patty, lettuce, tomato, avocado, and cheese.");
    }
}
