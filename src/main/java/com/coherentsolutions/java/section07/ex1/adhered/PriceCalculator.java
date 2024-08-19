package com.coherentsolutions.java.section07.ex1.adhered;

// Separate class for price calculation
class PriceCalculator {
    public double calculatePrice(String product, double basePrice) {
        double finalPrice = basePrice * 1.2;
        System.out.println("Calculating price for product: " + product + " - Final price: " + finalPrice);
        return finalPrice;
    }
}