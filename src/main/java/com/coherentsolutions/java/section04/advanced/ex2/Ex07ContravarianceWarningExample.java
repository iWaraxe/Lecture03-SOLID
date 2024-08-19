package com.coherentsolutions.java.section04.advanced.ex2;

/**
 * This class demonstrates a potential issue with contravariance in relation to the Liskov Substitution Principle (LSP).
 * It shows how incorrect method argument types can lead to LSP violations.
 */
public class Ex07ContravarianceWarningExample {
    public static void main(String[] args) {
        AnimalFeeder feeder = new AnimalFeeder();
        feeder.feed(new Dog()); // Works fine
        feeder.feed(new Animal()); // This can lead to unexpected behavior
    }
}

class Animal {
    public String eat() {
        return "Eating...";
    }
}

class Dog extends Animal {
    @Override
    public String eat() {
        return "Dog is eating dog food...";
    }
}

class AnimalFeeder {
    public void feed(Animal animal) {
        System.out.println(animal.eat());
    }
}
