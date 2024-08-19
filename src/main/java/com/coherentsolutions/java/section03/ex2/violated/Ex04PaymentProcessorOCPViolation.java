package com.coherentsolutions.java.section03.ex2.violated;

/**
 * This class violates the Open/Closed Principle (OCP).
 * It directly handles different payment types, requiring modification to add new types.
 */
public class Ex04PaymentProcessorOCPViolation {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CreditCard");
        processor.processPayment("PayPal");
    }
}

class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            processCreditCardPayment();
        } else if (paymentType.equals("PayPal")) {
            processPayPalPayment();
        }
    }

    private void processCreditCardPayment() {
        System.out.println("Processing credit card payment...");
    }

    private void processPayPalPayment() {
        System.out.println("Processing PayPal payment...");
    }
}
