package com.coherentsolutions.java.section06;

/**
 * This class demonstrates a violation of the Dependency Inversion Principle (DIP).
 * The high-level module (NotificationService) is directly dependent on the low-level module (EmailService).
 */
public class Ex01DIPViolation {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("user@example.com", "Hello, DIP!");
    }
}

class EmailService {
    public void sendEmail(String recipient, String message) {
        // Logic to send an email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class NotificationService {
    private EmailService emailService = new EmailService();

    public void sendNotification(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }
}
