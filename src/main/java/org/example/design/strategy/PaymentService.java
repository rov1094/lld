package org.example.design.strategy;

public class PaymentService {
    PaymentSystem paymentSystem;

    PaymentService(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void pay(){
        paymentSystem.pay();
    }

}
