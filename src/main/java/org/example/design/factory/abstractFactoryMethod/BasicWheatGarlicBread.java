package org.example.design.factory.abstractFactoryMethod;

public class BasicWheatGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Wheat Garlic Bread");
    }
}

