package com.coherentsolutions.java.section06.ex2.adhered;

/**
 * This class adheres to the Dependency Inversion Principle (DIP)
 * by introducing an abstraction (PaymentService) and using dependency injection.
 */
public class Ex04OrderServiceDIPRefactored {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentProcessor();
        OrderService orderService = new OrderService(paymentService);

        orderService.placeOrder("12345", 99.99);
    }
}

interface PaymentService {
    void processPayment(String orderId, double amount);
}

class PaymentProcessor implements PaymentService {
    @Override
    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment for order " + orderId + " of amount $" + amount);
    }
}

class OrderService {
    private final PaymentService paymentService;

    // Constructor injection
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(String orderId, double amount) {
        System.out.println("Placing order " + orderId);
        paymentService.processPayment(orderId, amount);
    }
}
