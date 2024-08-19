package com.coherentsolutions.java.section01.ex3DI.adhered;

public class SmsService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
