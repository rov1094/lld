package org.example.oops.inheritance;

public class Main {

    public static void main(String[] args) {

        ManualCar manualCar = new ManualCar("Honda", "Civic", "MyManualCar");
        manualCar.startEngine();
        manualCar.shiftGear(2);
        manualCar.displayInfo();

        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", "MyElectricCar");
        electricCar.startEngine();
        electricCar.chargeBattery();
        electricCar.displayInfo();
    }
}
