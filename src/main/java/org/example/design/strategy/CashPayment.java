package org.example.design.strategy;

public class CashPayment implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Paying using Cash");
    }
}
