package org.example.oops.polymorphism.overriding;

import org.example.oops.polymorphism.Car;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("Driving a manual car");
    }
}
