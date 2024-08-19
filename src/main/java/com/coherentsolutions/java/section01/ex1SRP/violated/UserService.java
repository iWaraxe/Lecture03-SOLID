package com.coherentsolutions.java.section01.ex1SRP.violated;

import com.coherentsolutions.java.section01.ex1SRP.Database;
import com.coherentsolutions.java.section01.ex1SRP.User;

public class UserService {
    public void saveUser(User user) {
        if (isValidUser(user)) {
            Database.save(user);
        }
    }

    private boolean isValidUser(User user) {
        return user.getName() != null && user.getAge() > 18;
    }
}