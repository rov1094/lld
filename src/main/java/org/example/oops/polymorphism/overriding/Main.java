package org.example.oops.polymorphism.overriding;

import org.example.oops.polymorphism.Car;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.drive(); // Output: Driving a car

        Car myManualCar = new ManualCar();
        myManualCar.drive(); // Output: Driving a manual car

        Car myElectricCar = new ElectricCar();
        myElectricCar.drive(); // Output: Driving an electric car
    }
}
