package org.example.design.factory.factorymethod;

import org.example.design.factory.factorymethod.healthyBurger.BasicWheatBurger;
import org.example.design.factory.factorymethod.healthyBurger.PremiumWheatBurger;
import org.example.design.factory.factorymethod.healthyBurger.StandardWheatBurger;

public class SinghBurgerFactory implements BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("basic")) {
            return new BasicWheatBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardWheatBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumWheatBurger();
        } else {
            throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }
}
