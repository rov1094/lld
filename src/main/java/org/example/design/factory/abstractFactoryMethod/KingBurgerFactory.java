package org.example.design.factory.abstractFactoryMethod;

public class KingBurgerFactory implements Factory {
    @Override
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("basic")) {
            return new BasicBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumBurger();
        } else {
            throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        return new BasicGarlicBread();
    }
}
