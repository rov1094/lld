package org.example.oops.inheritance;

public class ElectricCar extends Car {
    public String batteryPercentage;

    public ElectricCar(String brand, String model, String name) {
        super(brand, model, name);
    }

    public void chargeBattery() {
        batteryPercentage = 50 + " %";
        System.out.println("Charging the battery for " + this.name);
    }

     public void displayInfo() {
        System.out.println("This is an electric car with battery percentage: " + batteryPercentage);
    }
}
