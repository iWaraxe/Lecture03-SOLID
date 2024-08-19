package com.coherentsolutions.java.section01.ex1SRP.adhered;

import com.coherentsolutions.java.section01.ex1SRP.User;

public class UserValidator {
    public boolean isValidUser(User user) {
        return user.getName() != null && user.getAge() > 18;
    }
}