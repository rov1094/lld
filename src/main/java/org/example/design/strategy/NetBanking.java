package org.example.design.strategy;

public class NetBanking implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Paying using Net Banking");
    }
}
