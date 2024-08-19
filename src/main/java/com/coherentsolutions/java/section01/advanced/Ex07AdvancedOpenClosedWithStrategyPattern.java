package com.coherentsolutions.java.section01.advanced;

/**
 * Advanced example adhering to the Open/Closed Principle using the Strategy Pattern.
 * This pattern allows behavior to be selected at runtime, enhancing flexibility.
 */
public class Ex07AdvancedOpenClosedWithStrategyPattern {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        PaymentStrategy payPalPayment = new PayPalPaymentStrategy();

        paymentProcessor.setPaymentStrategy(creditCardPayment);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(payPalPayment);
        paymentProcessor.processPayment();
    }
}

interface PaymentStrategy {
    void processPayment();
}

class CreditCardPaymentStrategy implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing credit card payment via strategy.");
    }
}

class PayPalPaymentStrategy implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing PayPal payment via strategy.");
    }
}

class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }
}
