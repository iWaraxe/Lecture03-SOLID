package com.coherentsolutions.java.section06.advanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * This class demonstrates the use of the Dependency Inversion Principle (DIP) with the Spring Framework.
 * Spring's IoC container handles the dependency injection automatically.
 */
public class Ex05DIPWithSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("12345", 99.99);
    }
}

@Configuration
@ComponentScan(basePackages = "com.coherentsolutions.java.section06.advanced")
class AppConfig {
    // Spring will automatically scan and configure beans
}

interface PaymentService {
    void processPayment(String orderId, double amount);
}

@Service
class PaymentProcessor implements PaymentService {
    @Override
    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment for order " + orderId + " of amount $" + amount);
    }
}

@Service
class OrderService {
    private final PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(String orderId, double amount) {
        System.out.println("Placing order " + orderId);
        paymentService.processPayment(orderId, amount);
    }
}
