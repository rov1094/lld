package org.example.design.strategy;
/**
 * Concrete strategy for my strategy pattern example.
 */
public class UPIPayment implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }
}
