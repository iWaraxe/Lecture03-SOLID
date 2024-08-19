package com.coherentsolutions.java.section08;

/**
 * Example demonstrating the Open/Closed Principle (OCP).
 */
interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of: $" + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of: $" + amount);
    }
}

class OrderService {
    private PaymentProcessor paymentProcessor;

    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order...");
        paymentProcessor.processPayment(amount);
    }
}

public class Ex02OpenClosedPrinciple {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        OrderService orderService = new OrderService(creditCardProcessor);
        orderService.placeOrder(150.0);

        PaymentProcessor payPalProcessor = new PayPalProcessor();
        OrderService orderService2 = new OrderService(payPalProcessor);
        orderService2.placeOrder(200.0);
    }
}
