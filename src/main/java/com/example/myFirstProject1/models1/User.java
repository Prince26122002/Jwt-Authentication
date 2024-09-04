package com.example.myFirstProject1.models1;

public class User {
    private String userId;
    private String name;

    public User(String id, String name, String email) {
        this.userId = id;
        this.name = name;
        this.email = email;
    }

    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
