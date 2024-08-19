package com.coherentsolutions.java.section01.ex3DI.violation;

/**
 * This class violates the Dependency Inversion Principle (DIP).
 * NotificationService is tightly coupled to the EmailService class.
 */
public class Ex05DependencyInversionViolation {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser("Hello, this is a notification!");
    }
}
