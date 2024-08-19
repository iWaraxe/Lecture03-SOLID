package com.coherentsolutions.java.section07.ex1.violated;

/**
 * Initial version of ProductService that violates SRP and OCP.
 */
public class Ex01ProductServiceInitial {
    public void addProduct(String product) {
        // Logic to add product
        System.out.println("Adding product: " + product);
    }

    public void updateProduct(String product) {
        // Logic to update product
        System.out.println("Updating product: " + product);
    }

    public void deleteProduct(String product) {
        // Logic to delete product
        System.out.println("Deleting product: " + product);
    }

    public double calculatePrice(String product, double basePrice) {
        // Logic to calculate price with discounts and taxes
        double finalPrice = basePrice * 1.2; // Example calculation
        System.out.println("Calculating price for product: " + product + " - Final price: " + finalPrice);
        return finalPrice;
    }

    public void manageInventory(String product, int quantity) {
        // Logic to manage inventory
        System.out.println("Managing inventory for product: " + product + " - Quantity: " + quantity);
    }
}
