package com.coherentsolutions.java.section04.ex2.violated;

/**
 * This class demonstrates a classic violation of the Liskov Substitution Principle (LSP)
 * using the Rectangle and Square example.
 */
public class Ex03RectangleLSPViolation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Outputs: 50

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(10);
        System.out.println("Square area: " + square.getArea()); // Outputs: 100 (unexpected behavior)
    }
}

class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
