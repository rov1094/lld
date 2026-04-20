package org.example.oops.inheritance;

public class ManualCar extends Car {
    private int gearCount;

    public ManualCar(String brand, String model, String name) {
        super(brand, model, name);
    }

    public void shiftGear(int gear) {
        gearCount = gear;
        System.out.println("Shifting to gear " + gearCount);
    }

     public void displayInfo() {
        System.out.println("This is a manual car with " + gearCount + " gears.");
    }
}
