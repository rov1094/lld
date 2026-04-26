package org.example.design.factory.abstractFactoryMethod;

public interface Factory {
   Burger createBurger(String type);
   GarlicBread createGarlicBread(String type);
}
