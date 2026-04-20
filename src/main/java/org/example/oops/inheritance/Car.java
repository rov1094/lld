package org.example.oops.inheritance;

abstract class Car {
    protected final String brand;
    protected final String model;
    protected final String name;

    public Car(String brand, String model, String name) {
        this.brand = brand;
        this.model = model;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Engine started for " + this.name+ " " + this.brand + " " + this.model);
    }

    public void stopEngine() {
        System.out.println("Engine stopped for " + this.name+ " " + this.brand + " " + this.model);
    }

}
