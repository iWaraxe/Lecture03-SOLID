package com.coherentsolutions.java.section04.ex1.violated;

/**
 * This class demonstrates a violation of the Liskov Substitution Principle (LSP).
 * The Penguin class cannot be substituted for the Bird class without altering program behavior.
 */
public class Ex01BirdLSPViolation {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Outputs: Bird is flying

        Bird penguin = new Penguin();
        penguin.fly(); // Throws UnsupportedOperationException at runtime!
    }
}

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
