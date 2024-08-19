package com.coherentsolutions.java.section01.ex3DI.adhered;

/**
 * This example adheres to the Dependency Inversion Principle (DIP).
 * NotificationService depends on an abstraction, not a concrete class.
 */
public class Ex06DependencyInversionAdhered {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.notifyUser("Hello, this is a notification!");

        MessageService smsService = new SmsService();
        NotificationService notificationServiceSms = new NotificationService(smsService);
        notificationServiceSms.notifyUser("Hello, this is a notification via SMS!");
    }
}