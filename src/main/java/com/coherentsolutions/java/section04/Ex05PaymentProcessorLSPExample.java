package com.coherentsolutions.java.section04;

/**
 * This class demonstrates the Liskov Substitution Principle (LSP)
 * in the context of a payment processing system.
 */
public class Ex05PaymentProcessorLSPExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new CreditCardProcessor();
        processor.processPayment(100.0); // Outputs: Processing credit card payment of: $100.0

        processor = new PayPalProcessor();
        processor.processPayment(200.0); // Outputs: Processing PayPal payment of: $200.0
    }
}

abstract class PaymentProcessor {
    public abstract void processPayment(double amount);
}

class CreditCardProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of: $" + amount);
    }
}

class PayPalProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of: $" + amount);
    }
}
