package com.coherentsolutions.java.section01.advanced;

/**
 * Advanced example adhering to the Dependency Inversion Principle using the Factory Pattern.
 * This pattern allows the creation of objects without specifying the exact class of object that will be created.
 */
public class Ex08AdvancedDependencyInversionWithFactory {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        NotificationService emailNotificationService = new NotificationService(factory.createMessageService("Email"));
        emailNotificationService.notifyUser("This is an email notification!");

        NotificationService smsNotificationService = new NotificationService(factory.createMessageService("SMS"));
        smsNotificationService.notifyUser("This is an SMS notification!");
    }
}

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SmsService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

class NotificationFactory {
    public MessageService createMessageService(String type) {
        if (type.equalsIgnoreCase("Email")) {
            return new EmailService();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SmsService();
        } else {
            throw new IllegalArgumentException("Unknown service type");
        }
    }
}
