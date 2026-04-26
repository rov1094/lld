package org.example.design.factory.abstractFactoryMethod.healthyBurger;

import org.example.design.factory.abstractFactoryMethod.Burger;

public class PremiumWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Wheat Burger with whole wheat bun, organic patty, lettuce, tomato, avocado, and cheese.");
    }
}
