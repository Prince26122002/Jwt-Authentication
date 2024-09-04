package com.example.myFirstProject1.controllers;

import com.example.myFirstProject1.Services.UserService;
import com.example.myFirstProject1.models1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/home")
@SpringBootApplication
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("Getting user");
        return userService.getUser();
    }
}
