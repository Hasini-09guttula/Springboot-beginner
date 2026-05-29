package com.hasini.WebProject.model;

public class User {
    // 1. Fixed the typo from 'naem' to 'name'
    String name, gender, image;
    int id;

    // 2. Constructor name now perfectly matches the capitalized class name
    public User() {
    }

    // 3. Added 'String gender' to the parameters so 'this.gender = gender' works
    public User(String name, String gender, String image, int id) {
        this.gender = gender;
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}