package controller;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import services.StudentServices;

@RestController
public class StudentController {
	
	@GetMapping("/students")
	public StudentServices students() {
		return new StudentServices(1,"Gabriel", "gab@gmail.com", 0, LocalDate.of(1999, Month.SEPTEMBER, 13), 12);
	}
	

}
