package com.assignments.bank;

import java.util.Date;

public class PermanentEmployee extends Employee {

	private int salary;
	private Date doj;

	public PermanentEmployee(int id, String ename, String department, String email, int salary, Date doj) {
		super(id, ename, department, email);
		this.salary = salary;
		this.doj = doj;
	}

	public PermanentEmployee(int id, String ename, String department, String email, int salary) {
		this(id, ename, department, email, salary, null);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [salary=" + salary + ", doj=" + doj + ", getId()=" + getId() + ", getEname()="
				+ getEname() + ", getDepartment()=" + getDepartment() + ", getEmail()=" + getEmail() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
