package com.coherentsolutions.java.section03.ex2.add;

/**
 * This class demonstrates adding a new payment method (Bitcoin) without modifying existing code.
 * Adheres to the Open/Closed Principle (OCP).
 */
public class Ex06AddNewPaymentMethodBitcoin {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CreditCardPayment());
        processor.processPayment(new PayPalPayment());
        processor.processPayment(new BitcoinPayment()); // Newly added payment method
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

class BitcoinPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin payment...");
    }
}

class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}
