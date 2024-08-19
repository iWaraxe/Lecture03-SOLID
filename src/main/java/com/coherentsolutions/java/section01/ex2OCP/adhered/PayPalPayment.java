package com.coherentsolutions.java.section01.ex2OCP.adhered;

public class PayPalPayment implements PaymentMethod {
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }
}
