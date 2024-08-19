package com.coherentsolutions.java.section05.advanced;

/**
 * This class demonstrates the use of interface inheritance to adhere to the Interface Segregation Principle (ISP).
 */
public class Ex05InterfaceInheritance {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.login("admin", "password");
        admin.viewDashboard();
        admin.configureAdminSettings();
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

interface AdminUser extends Loginable, DashboardViewable, AdminConfigurable {
    // Inherits methods from Loginable, DashboardViewable, and AdminConfigurable
}

class Admin implements AdminUser {
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
