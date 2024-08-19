package com.coherentsolutions.java.section04.ex1.adhered;

/**
 * This class adheres to the Liskov Substitution Principle (LSP).
 * By using an interface for flying capability, only birds that can fly implement it.
 */
public class Ex02BirdLSPAdhered {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat(); // Outputs: Bird is eating
        sparrow.fly(); // Outputs: Sparrow is flying

        Penguin penguin = new Penguin();
        penguin.eat(); // Outputs: Bird is eating
        // No fly method called for penguin, so no risk of LSP violation
    }
}

interface Flyable {
    void fly();
}

class Bird {
    public void eat() {
        System.out.println("Bird is eating");
    }
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    // No fly method here, as penguins can't fly
}
