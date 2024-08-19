package com.coherentsolutions.java.section08;

/**
 * Example demonstrating the Interface Segregation Principle (ISP).
 */
interface UserManager {
    void login(String username, String password);
}

interface Notifier {
    void sendNotification(String message);
}

class AdminUser implements UserManager, Notifier {
    @Override
    public void login(String username, String password) {
        System.out.println("Admin user logged in with username: " + username);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Admin notification: " + message);
    }
}

class RegularUser implements UserManager {
    @Override
    public void login(String username, String password) {
        System.out.println("Regular user logged in with username: " + username);
    }
}

public class Ex04InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        UserManager admin = new AdminUser();
        admin.login("adminUser", "password123");

        Notifier notifier = new AdminUser();
        notifier.sendNotification("System update scheduled.");

        UserManager regularUser = new RegularUser();
        regularUser.login("regularUser", "password123");
    }
}
