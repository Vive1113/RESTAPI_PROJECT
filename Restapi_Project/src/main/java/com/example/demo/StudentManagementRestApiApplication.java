package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementRestApiApplication.class, args);
		System.out.println("Server Started...");
	}

}
