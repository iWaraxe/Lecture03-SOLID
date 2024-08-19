package com.coherentsolutions.java.section02;

/**
 * This class adheres to the Single Responsibility Principle (SRP).
 * It coordinates the user validation, persistence, and notification responsibilities.
 */
public class Ex05UserServiceSRPAdhered {
    public static void main(String[] args) {
        User user = new User("Eve", "eve@example.com");
        UserService userService = new UserService();
        userService.registerUser(user);
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

    static class UserValidator {
        public boolean isValid(User user) {
            return user.getName() != null && user.getEmail() != null;
        }
    }

    static class UserRepository {
        public void save(User user) {
            Database.save(user);
        }
    }

    static class UserNotifier {
        public void notifyUser(User user) {
            EmailService.sendEmail(user.getEmail(), "Welcome " + user.getName() + "!");
        }
    }

    static class Database {
        public static void save(User user) {
            System.out.println("User " + user.getName() + " saved to the database.");
        }
    }

    static class EmailService {
        public static void sendEmail(String email, String message) {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }

    static class UserService {
        private UserValidator validator = new UserValidator();
        private UserRepository repository = new UserRepository();
        private UserNotifier notifier = new UserNotifier();

        public void registerUser(User user) {
            if (validator.isValid(user)) {
                repository.save(user);
                notifier.notifyUser(user);
            }
        }
    }
}
