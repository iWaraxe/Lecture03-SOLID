package com.coherentsolutions.java.section01.ex1SRP.violated;

import com.coherentsolutions.java.section01.ex1SRP.User;

/**
 * This class violates the Single Responsibility Principle (SRP).
 * It handles both business logic (validating a user) and data access (saving a user).
 */
public class Ex01SingleResponsibilityViolation {
    public static void main(String[] args) {
        User user = new User("John Doe", 25);
        UserService userService = new UserService();
        userService.saveUser(user);
    }
}






