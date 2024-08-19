package com.coherentsolutions.java.section01.ex2OCP.adhered;

public class CreditCardPayment implements PaymentMethod {
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
