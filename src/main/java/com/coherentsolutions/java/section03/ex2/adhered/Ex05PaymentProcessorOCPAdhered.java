package com.coherentsolutions.java.section03.ex2.adhered;

/**
 * This example adheres to the Open/Closed Principle (OCP).
 * It uses an interface to handle different payment methods, allowing new methods to be added without modifying existing code.
 */
public class Ex05PaymentProcessorOCPAdhered {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CreditCardPayment());
        processor.processPayment(new PayPalPayment());
    }
}

interface PaymentMethod {
    void processPayment();
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}
