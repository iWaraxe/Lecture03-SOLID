package com.coherentsolutions.java.section01.ex3DI.violation;

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
