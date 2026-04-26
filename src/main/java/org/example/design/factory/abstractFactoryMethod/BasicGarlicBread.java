package org.example.design.factory.abstractFactoryMethod;

public class BasicGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Garlic Bread");
    }
}

