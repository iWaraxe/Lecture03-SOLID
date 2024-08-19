package com.coherentsolutions.java.section01.ex1SRP.adhered;

import com.coherentsolutions.java.section01.ex1SRP.User;

public class UserService {
    private UserValidator validator = new UserValidator();
    private UserRepository repository = new UserRepository();

    public void saveUser(User user) {
        if (validator.isValidUser(user)) {
            repository.saveUser(user);
        }
    }
}