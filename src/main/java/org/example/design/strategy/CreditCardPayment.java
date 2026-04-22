package org.example.design.strategy;

public class CreditCardPayment implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("Paying using Credit Card");
    }
}
