package com.coherentsolutions.java.section01.ex2OCP.adhered;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}
