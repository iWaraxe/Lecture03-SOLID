package com.coherentsolutions.java.section02;

/**
 * This class is responsible for user validation only.
 * It adheres to the Single Responsibility Principle (SRP).
 */
public class Ex02UserValidator {
    public static void main(String[] args) {
        User user = new User("Bob", "bob@example.com");
        UserValidator validator = new UserValidator();

        if (validator.isValid(user)) {
            System.out.println("User is valid.");
        } else {
            System.out.println("User is not valid.");
        }
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
}
