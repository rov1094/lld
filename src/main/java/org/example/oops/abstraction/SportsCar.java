package org.example.oops.abstraction;

public class SportsCar extends Car {
    String brandName;
    String model;
    boolean isEngineOn;
    int currentSpeed;
    int currentGear;

    SportsCar(String brandName, String model) {
        this.brandName = brandName;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    @Override
    void startEngine() {
        this.isEngineOn = true;
        System.out.println("Engine started for with a roar " + brandName + " " + model);
    }

    @Override
    void shiftGear(int gear) {
        if (gear > currentGear && isEngineOn) {
            this.currentGear = gear;
            System.out.println("Shifted to gear " + currentGear);
        }else{
            System.out.println("Cannot shift to gear " + gear + ". Current gear: " + currentGear + ". Engine status: " + (isEngineOn ? "On" : "Off"));
        }
    }

    @Override
    void accelerate() {
        this.currentSpeed++;
        System.out.println("Accelerating... Current speed: " + currentSpeed + " km/h");
    }

    @Override
    void brake() {
        this.currentSpeed--;
        this.currentGear--;
        System.out.println("Braking... Current speed: " + currentSpeed + " km/h");
    }

    @Override
    void stopEngine() {
        this.currentGear=0;
        this.currentSpeed=0;
        this.isEngineOn=false;
        System.out.println("Engine stopped for " + brandName + " " + model);
    }
}
