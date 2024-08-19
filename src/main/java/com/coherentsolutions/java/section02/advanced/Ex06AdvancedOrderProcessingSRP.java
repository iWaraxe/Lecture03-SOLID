package com.coherentsolutions.java.section02.advanced;

import java.util.ArrayList;
import java.util.List;

/**
 * This advanced example demonstrates SRP in an e-commerce application.
 * Each class has a single responsibility related to order processing.
 */
public class Ex06AdvancedOrderProcessingSRP {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Laptop", 1, 1000.00));
        order.addItem(new Item("Mouse", 2, 25.00));

        OrderService orderService = new OrderService();
        orderService.processOrder(order);
    }
}

class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}

class Order {
    private List<Item> items = new ArrayList<>();
    private double total;

    public void addItem(Item item) {
        items.add(item);
        total += item.getTotalPrice();
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

class OrderValidator {
    public boolean isValid(Order order) {
        return order.getItems().size() > 0 && order.getTotal() > 0;
    }
}

class PriceCalculator {
    public double calculateTotal(Order order) {
        return order.getItems().stream().mapToDouble(Item::getTotalPrice).sum();
    }
}

class PaymentProcessor {
    public void processPayment(Order order) {
        System.out.println("Processing payment for order total: $" + order.getTotal());
    }
}

class InventoryUpdater {
    public void updateInventory(Order order) {
        for (Item item : order.getItems()) {
            System.out.println("Updating inventory for item: " + item.getName() + " - Quantity: " + item.getQuantity());
        }
    }
}

class OrderService {
    private OrderValidator validator = new OrderValidator();
    private PriceCalculator calculator = new PriceCalculator();
    private PaymentProcessor processor = new PaymentProcessor();
    private InventoryUpdater updater = new InventoryUpdater();

    public void processOrder(Order order) {
        if (validator.isValid(order)) {
            double total = calculator.calculateTotal(order);
            order.setTotal(total);
            processor.processPayment(order);
            updater.updateInventory(order);
        }
    }
}
