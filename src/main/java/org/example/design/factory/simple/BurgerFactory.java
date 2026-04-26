package org.example.design.factory.simple;

public class BurgerFactory {
    public Burger createBurger(String type) {
        switch (type.toLowerCase()) {
            case "regular":
                return new RegularBurger();
            case "premium":
                return new PremiumBurger();
            case "standard":
                return new StandardBurger();
            default:
                throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }
}
