package org.example.oops.polymorphism.overloading;

import org.example.oops.polymorphism.Car;

public class ManualCar extends Car {

    public void drive() {
        System.out.println("Driving a manual car");
    }

    public void drive(String gearType) {
        System.out.println("Driving a manual car with " + gearType + " gears");
    }
}
