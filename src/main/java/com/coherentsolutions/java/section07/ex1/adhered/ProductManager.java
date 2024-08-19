package com.coherentsolutions.java.section07.ex1.adhered;

/**
 * Refactored version of ProductService that adheres to SRP and OCP.
 */

// Separate class for product management
class ProductManager {
    public void addProduct(String product) {
        System.out.println("Adding product: " + product);
    }

    public void updateProduct(String product) {
        System.out.println("Updating product: " + product);
    }

    public void deleteProduct(String product) {
        System.out.println("Deleting product: " + product);
    }
}