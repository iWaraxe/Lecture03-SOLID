package com.coherentsolutions.java.section02;

/**
 * This class is responsible for user notifications only.
 * It adheres to the Single Responsibility Principle (SRP).
 */
public class Ex04UserNotifier {
    public static void main(String[] args) {
        User user = new User("Dave", "dave@example.com");
        UserNotifier notifier = new UserNotifier();
        notifier.notifyUser(user);
    }

    static class User {
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

    static class EmailService {
        public static void sendEmail(String email, String message) {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }

    static class UserNotifier {
        public void notifyUser(User user) {
            EmailService.sendEmail(user.getEmail(), "Welcome " + user.getName() + "!");
        }
    }
}
