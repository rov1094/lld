package org.example.oops.polymorphism.overriding;

import org.example.oops.polymorphism.Car;

public class ElectricCar extends Car {

    @Override
    public void drive() {
        System.out.println("Driving an electric car");
    }
}
