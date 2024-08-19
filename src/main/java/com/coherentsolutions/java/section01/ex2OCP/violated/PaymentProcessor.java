package com.coherentsolutions.java.section01.ex2OCP.violated;

class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            processCreditCardPayment();
        } else if (paymentType.equals("PayPal")) {
            processPayPalPayment();
        }
        // Violates OCP as new payment methods require modification in this method
    }

    private void processCreditCardPayment() {
        System.out.println("Processing credit card payment.");
    }

    private void processPayPalPayment() {
        System.out.println("Processing PayPal payment.");
    }
}
