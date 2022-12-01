package com.assignments.bank;

import java.util.regex.Pattern;

public class Employee {
	private int id;
	private String ename;
	private String department;
//	private int salary;
	private static String organization = "yash";
	private String email;

	public Employee(int id, String ename, String department, String email) {
		super();
		this.id = id;
		this.ename = ename;
		this.department = department;
		this.email = email;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		if (ename.equalsIgnoreCase("pagal"))
			this.ename = "";
		else
			this.ename = ename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

	/*
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { if (age >= 18 && age <= 60) { this.age = age; }
	 * else { this.age = 0; }
	 * 
	 * }
	 */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailNotValidException {
		// Regular Expression
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(email).matches())
			this.email = email;
		else
			throw new EmailNotValidException("Not a valid email : " + email);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", department=" + department + ", email=" + email
				+ ", organization=" + organization + "]";
	}

}
