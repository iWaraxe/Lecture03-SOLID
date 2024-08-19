package com.coherentsolutions.java.section01.ex3DI.violation;

public class NotificationService {
    private EmailService emailService = new EmailService();

    public void notifyUser(String message) {
        emailService.sendEmail(message);
    }
}