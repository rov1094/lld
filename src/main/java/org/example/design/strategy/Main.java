package org.example.design.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.pay();
        paymentService = new PaymentService(new CashPayment());
        paymentService.pay();
    }
}
