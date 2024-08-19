package com.coherentsolutions.java.section02;

/**
 * This class is responsible for user persistence only.
 * It adheres to the Single Responsibility Principle (SRP).
 */
public class Ex03UserRepository {
    public static void main(String[] args) {
        User user = new User("Charlie", "charlie@example.com");
        UserRepository repository = new UserRepository();
        repository.save(user);
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

    static class Database {
        public static void save(User user) {
            System.out.println("User " + user.getName() + " saved to the database.");
        }
    }

    static class UserRepository {
        public void save(User user) {
            Database.save(user);
        }
    }
}
