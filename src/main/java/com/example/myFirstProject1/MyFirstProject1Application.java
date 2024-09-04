package com.example.myFirstProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyFirstProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProject1Application.class, args);
	}

}
