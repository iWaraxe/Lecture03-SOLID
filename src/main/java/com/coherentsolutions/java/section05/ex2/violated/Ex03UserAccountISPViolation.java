package com.coherentsolutions.java.section05.ex2.violated;

/**
 * This class demonstrates a violation of the Interface Segregation Principle (ISP).
 * The UserAccount interface forces RegularUser to implement methods it does not need.
 */
public class Ex03UserAccountISPViolation {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.login("admin", "password");
        admin.viewDashboard();
        admin.configureAdminSettings();

        RegularUser regularUser = new RegularUser();
        regularUser.login("user", "password");
        regularUser.viewDashboard();
        try {
            regularUser.configureAdminSettings();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}

interface UserAccount {
    void login(String username, String password);
    void viewDashboard();
    void configureAdminSettings();
}

class Admin implements UserAccount {
    @Override
    public void login(String username, String password) {
        System.out.println("Admin logged in");
    }

    @Override
    public void viewDashboard() {
        System.out.println("Viewing admin dashboard");
    }

    @Override
    public void configureAdminSettings() {
        System.out.println("Configuring admin settings");
    }
}

class RegularUser implements UserAccount {
    @Override
    public void login(String username, String password) {
        System.out.println("User logged in");
    }

    @Override
    public void viewDashboard() {
        System.out.println("Viewing user dashboard");
    }

    @Override
    public void configureAdminSettings() {
        throw new UnsupportedOperationException("Regular users cannot configure admin settings.");
    }
}
