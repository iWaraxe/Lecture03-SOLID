package com.coherentsolutions.java.section06.ex1.adhered;

/**
 * This class demonstrates adherence to the Dependency Inversion Principle (DIP)
 * by introducing an abstraction (NotificationSender) and using dependency injection.
 */
public class Ex02DIPRefactored {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailService();
        NotificationService notificationService = new NotificationService(emailSender);

        notificationService.sendNotification("user@example.com", "Hello, DIP!");
    }
}

interface NotificationSender {
    void send(String recipient, String message);
}

class EmailService implements NotificationSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class NotificationService {
    private final NotificationSender notificationSender;

    // Constructor injection
    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String recipient, String message) {
        notificationSender.send(recipient, message);
    }
}
