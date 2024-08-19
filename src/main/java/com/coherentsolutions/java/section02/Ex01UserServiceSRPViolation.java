package com.coherentsolutions.java.section02;

/**
 * This class violates the Single Responsibility Principle (SRP).
 * It handles multiple responsibilities: user validation, persistence, and notification.
 */
public class Ex01UserServiceSRPViolation {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        UserService userService = new UserService();
        userService.saveUser(user);
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Database {
    public static void save(User user) {
        System.out.println("User " + user.getName() + " saved to the database.");
    }
}

class EmailService {
    public static void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}

class UserService {
    public void saveUser(User user) {
        if (isValidUser(user)) {
            saveToDatabase(user);
            sendNotification(user);
        }
    }

    private boolean isValidUser(User user) {
        return user.getName() != null && user.getEmail() != null;
    }

    private void saveToDatabase(User user) {
        Database.save(user);
    }

    private void sendNotification(User user) {
        EmailService.sendEmail(user.getEmail(), "Welcome " + user.getName() + "!");
    }
}
