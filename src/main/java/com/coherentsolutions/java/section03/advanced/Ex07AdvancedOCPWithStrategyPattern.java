package com.coherentsolutions.java.section03.advanced;

/**
 * Advanced example demonstrating the Open/Closed Principle (OCP) using the Strategy Pattern.
 * The ShoppingCart class can handle different payment strategies without being modified.
 */
public class Ex07AdvancedOCPWithStrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card payment strategy
        cart.setPaymentStrategy(new CreditCardStrategy());
        cart.checkout(100);

        // Use PayPal payment strategy
        cart.setPaymentStrategy(new PayPalStrategy());
        cart.checkout(200);
    }
}

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
