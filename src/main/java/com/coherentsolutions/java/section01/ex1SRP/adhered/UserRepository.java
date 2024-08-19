package com.coherentsolutions.java.section01.ex1SRP.adhered;

import com.coherentsolutions.java.section01.ex1SRP.Database;
import com.coherentsolutions.java.section01.ex1SRP.User;

public class UserRepository {
    public void saveUser(User user) {
        Database.save(user);
    }
}
