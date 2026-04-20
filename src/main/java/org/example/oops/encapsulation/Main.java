package org.example.oops.encapsulation;


public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ford", "Mustang");
        //sportsCar.currentSpeed=100;//Not allowed due to data security and encapsulation
        sportsCar.startEngine();
        sportsCar.shiftGear(2);
        sportsCar.accelerate();
        sportsCar.getCurrentSpeed();
        sportsCar.brake();
        sportsCar.getCurrentSpeed();
        sportsCar.stopEngine();
    }
}
