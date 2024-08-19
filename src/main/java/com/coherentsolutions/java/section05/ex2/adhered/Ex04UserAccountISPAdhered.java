package com.coherentsolutions.java.section05.ex2.adhered;

/**
 * This class adheres to the Interface Segregation Principle (ISP)
 * by breaking down the UserAccount interface into smaller, focused interfaces.
 */
public class Ex04UserAccountISPAdhered {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.login("admin", "password");
        admin.viewDashboard();
        admin.configureAdminSettings();

        RegularUser regularUser = new RegularUser();
        regularUser.login("user", "password");
        regularUser.viewDashboard();
    }
}

interface Loginable {
    void login(String username, String password);
}

interface DashboardViewable {
    void viewDashboard();
}

interface AdminConfigurable {
    void configureAdminSettings();
}

class Admin implements Loginable, DashboardViewable, AdminConfigurable {
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

class RegularUser implements Loginable, DashboardViewable {
    @Override
    public void login(String username, String password) {
        System.out.println("User logged in");
    }

    @Override
    public void viewDashboard() {
        System.out.println("Viewing user dashboard");
    }
}
