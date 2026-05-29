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
    }

    // Name is of our choice
    public List<User> getAllUsers() {
        return allUsers;
    }
}