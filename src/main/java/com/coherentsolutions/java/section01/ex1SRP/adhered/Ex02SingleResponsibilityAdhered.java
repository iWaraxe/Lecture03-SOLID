package com.coherentsolutions.java.section01.ex1SRP.adhered;

import com.coherentsolutions.java.section01.ex1SRP.User;

/**
 * This example adheres to the Single Responsibility Principle (SRP).
 * Responsibilities are divided among different classes.
 */
public class Ex02SingleResponsibilityAdhered {
    public static void main(String[] args) {
        User user = new User("Jane Doe", 30);
        UserService userService = new UserService();
        userService.saveUser(user);
    }
}

