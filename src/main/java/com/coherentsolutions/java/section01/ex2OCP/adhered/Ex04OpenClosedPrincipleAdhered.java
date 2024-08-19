package com.coherentsolutions.java.section01.ex2OCP.adhered;

/**
 * This example adheres to the Open/Closed Principle (OCP).
 * New payment methods can be added without modifying existing code.
 */
public class Ex04OpenClosedPrincipleAdhered {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();

        paymentProcessor.processPayment(creditCardPayment);
        paymentProcessor.processPayment(payPalPayment);
    }
}