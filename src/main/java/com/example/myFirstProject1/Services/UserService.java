package com.example.myFirstProject1.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.myFirstProject1.models1.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Prince Mittal", "pm4109291@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Yash Mittal", "yash@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Gaurav Mittal", "gaurav@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Akash Mittal", "akash@gmail.com"));

    }

    public List<User> getUser() {
        return this.store;
    }
}
