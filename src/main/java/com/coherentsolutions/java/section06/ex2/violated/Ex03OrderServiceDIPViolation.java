package com.coherentsolutions.java.section06.ex2.violated;

/**
 * This class demonstrates a violation of the Dependency Inversion Principle (DIP)
 * where the high-level module (OrderService) directly depends on the low-level module (PaymentProcessor).
 */
public class Ex03OrderServiceDIPViolation {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("12345", 99.99);
    }
}

class PaymentProcessor {
    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment for order " + orderId + " of amount $" + amount);
    }
}

class OrderService {
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();

    public void placeOrder(String orderId, double amount) {
        System.out.println("Placing order " + orderId);
        paymentProcessor.processPayment(orderId, amount);
    }
}
