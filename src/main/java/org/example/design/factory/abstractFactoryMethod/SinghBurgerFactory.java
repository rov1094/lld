package org.example.design.factory.abstractFactoryMethod;

import org.example.design.factory.abstractFactoryMethod.healthyBurger.BasicWheatBurger;
import org.example.design.factory.abstractFactoryMethod.healthyBurger.PremiumWheatBurger;
import org.example.design.factory.abstractFactoryMethod.healthyBurger.StandardWheatBurger;

public class SinghBurgerFactory implements Factory {
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

    @Override
    public GarlicBread createGarlicBread(String type) {
        return new BasicWheatGarlicBread();
    }
}
