package com.coherentsolutions.java.section04.ex2.adhered;

/**
 * This class adheres to the Liskov Substitution Principle (LSP)
 * by separating the Rectangle and Square classes and having them implement a common interface.
 */
public class Ex04RectangleLSPAdhered {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Outputs: 50

        Shape square = new Square(5);
        System.out.println("Square area: " + square.getArea()); // Outputs: 25
    }
}

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
