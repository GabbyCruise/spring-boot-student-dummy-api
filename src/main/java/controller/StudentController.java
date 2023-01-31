package controller;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import services.StudentServices;

@RestController
public class StudentController {
	
	//Returns single object {}
	@GetMapping("/student")
	public StudentServices student() {
		return new StudentServices(1,"Gabby", "gaby@gmail.com", 0, LocalDate.of(1999, Month.SEPTEMBER, 13), 12);
	};

	//Returns Array of Objects [{}]
	@GetMapping("/students")
	public List<StudentServices> listAllStudents(){
		List<StudentServices> students = new ArrayList();
			students.add(new StudentServices(1,"Gabby", "gaby@gmail.com", 0, LocalDate.of(1999, Month.SEPTEMBER, 13), 12));
			students.add(new StudentServices(2,"Ghostman", "ghostman@gmail.com", 0, LocalDate.of(1997, Month.AUGUST, 10), 11));
			students.add(new StudentServices(3,"Frank", "frank@gmail.com", 0, LocalDate.of(1986, Month.FEBRUARY, 20), 9));
			students.add(new StudentServices(4,"John Doe", "johndoe@gmail.com", 0, LocalDate.of(1899, Month.SEPTEMBER, 17), 106));
			return students;
	}
	
	@GetMapping("/student/")
	public StudentServices getSingleStudentWithParams() {
		//TODO: Implement this feature
		return null;
	}
	

}
