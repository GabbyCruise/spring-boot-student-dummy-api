package com.students.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.StudentController;

@SpringBootApplication
public class StudentsDummyApiApplication extends StudentController {

	public static void main(String[] args) {
		SpringApplication.run(StudentsDummyApiApplication.class, args);
	}

}
