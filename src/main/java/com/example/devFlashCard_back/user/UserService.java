package com.example.devFlashCard_back.user;

import org.springframework.stereotype.Service;

import java.util.List;

// Service Layer
@Service
public class UserService {
    public List<User> getUsers () {
        return List.of(
                new User(
                        1L,
                        "Elsa",
                        "madam@itmail.com",
                        "KK33ll",
                        "maitre du monde"
                )
        );
    }
}
