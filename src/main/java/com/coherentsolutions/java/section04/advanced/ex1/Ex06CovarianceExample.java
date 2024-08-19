package com.coherentsolutions.java.section04.advanced.ex1;

/**
 * This class demonstrates the concept of covariance in relation to the Liskov Substitution Principle (LSP).
 */
public class Ex06CovarianceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        System.out.println(myDog.makeSound()); // Outputs: Bark
    }
}

class Animal {
    public String makeSound() {
        return "Some sound";
    }
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }
}
