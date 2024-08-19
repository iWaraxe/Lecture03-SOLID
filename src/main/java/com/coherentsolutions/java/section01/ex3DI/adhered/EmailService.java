package com.coherentsolutions.java.section01.ex3DI.adhered;

public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
