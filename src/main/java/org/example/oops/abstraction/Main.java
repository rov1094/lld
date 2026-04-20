package org.example.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar("Ferrari", "488 GTB");
        sportsCar.startEngine();
        sportsCar.shiftGear(2);
        sportsCar.accelerate();
        sportsCar.brake();
        sportsCar.stopEngine();
    }
}
