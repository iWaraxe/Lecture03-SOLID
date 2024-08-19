package com.coherentsolutions.java.section01.ex1SRP;

public class Database {
    public static void save(User user) {
        System.out.println("User " + user.getName() + " saved to the database.");
    }
}