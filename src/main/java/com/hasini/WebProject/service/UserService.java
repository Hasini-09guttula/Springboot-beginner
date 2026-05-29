package com.hasini.WebProject.service;

import java.util.ArrayList;
import java.util.List;
import com.hasini.WebProject.model.User;
// FIXED: Added this import statement so Java recognizes the @Service annotation
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> allUsers;

    public UserService() {
        allUsers = new ArrayList<>(); // Empty Array List
        allUsers.add(new User("Hasini", "Female", "jane.png", 1));
    allUsers.add(new User("John Doe", "Male", "john.png", 2));
    }

    // Name is of our choice
    public List<User> getAllUsers() {
        return allUsers;
    }
}