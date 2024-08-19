package com.coherentsolutions.java.section08;

/**
 * Example demonstrating the Dependency Inversion Principle (DIP).
 */
interface PaymentService {
    void processPayment(double amount);
}

class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}

class OrderServiceDIP {
    private final PaymentService paymentService;

    public OrderServiceDIP(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order...");
        paymentService.processPayment(amount);
    }
}

public class Ex05DependencyInversionPrinciple {
    public static void main(String[] args) {
        PaymentService stripePaymentService = new StripePaymentService();
        OrderServiceDIP orderService = new OrderServiceDIP(stripePaymentService);
        orderService.placeOrder(300.0);
    }
}
