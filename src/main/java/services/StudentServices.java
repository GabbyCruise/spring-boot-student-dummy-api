package services;

import java.time.LocalDate;

public class StudentServices {

	private int userid;
	private String name;
	private String email;
	private double phone;
	private LocalDate dob;
	private int age;
	
	public StudentServices(
		int userid, String name, String email, 
		double phone, LocalDate dob, int age
		) {

		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.age = age;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
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
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
