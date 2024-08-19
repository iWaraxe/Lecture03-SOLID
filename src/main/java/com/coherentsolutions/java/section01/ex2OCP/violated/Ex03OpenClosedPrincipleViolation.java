package com.coherentsolutions.java.section01.ex2OCP.violated;

/**
 * This class violates the Open/Closed Principle (OCP).
 * Adding a new payment method requires modifying the existing code.
 */
public class Ex03OpenClosedPrincipleViolation {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard");
        paymentProcessor.processPayment("PayPal");
    }
}
