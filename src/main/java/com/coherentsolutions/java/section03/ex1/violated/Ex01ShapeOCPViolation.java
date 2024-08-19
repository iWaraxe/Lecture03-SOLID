package com.coherentsolutions.java.section03.ex1.violated;

/**
 * This class violates the Open/Closed Principle (OCP).
 * It calculates the area for specific shapes and needs modification to handle new shapes.
 */
public class Ex01ShapeOCPViolation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        Shape shape = new Shape();
        System.out.println("Rectangle area: " + shape.calculateArea(rectangle));
        System.out.println("Circle area: " + shape.calculateArea(circle));
    }
}

class Shape {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
