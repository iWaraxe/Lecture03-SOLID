package com.coherentsolutions.java.section08;

/**
 * Example demonstrating the Single Responsibility Principle (SRP).
 */
class ProductManager {
    public void addProduct(String product) {
        System.out.println("Product added: " + product);
    }
}

class PriceCalculator {
    public double calculatePrice(double basePrice, double discount) {
        return basePrice - (basePrice * discount);
    }
}

class InventoryManager {
    public void updateInventory(String product, int quantity) {
        System.out.println("Inventory updated for product: " + product + " with quantity: " + quantity);
    }
}

public class Ex01SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        PriceCalculator priceCalculator = new PriceCalculator();
        InventoryManager inventoryManager = new InventoryManager();

        productManager.addProduct("Laptop");
        double price = priceCalculator.calculatePrice(1000, 0.1);
        System.out.println("Price after discount: " + price);
        inventoryManager.updateInventory("Laptop", 10);
    }
}
