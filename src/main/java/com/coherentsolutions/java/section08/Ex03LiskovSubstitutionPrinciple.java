package com.coherentsolutions.java.section08;

/**
 * Example demonstrating the Liskov Substitution Principle (LSP).
 */
abstract class Bird {
    public abstract void fly();
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}

public class Ex03LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.fly();

        Bird penguin = new Penguin();
        try {
            penguin.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
