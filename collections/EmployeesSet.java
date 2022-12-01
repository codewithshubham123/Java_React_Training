package com.assignments.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int eid;
	String name;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return this.getEid() == other.getEid() && Objects.equals(this.getName(), other.getName());
	}

	@Override
	public int compareTo(Employee o) {
		return this.getEid() - o.getEid();
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	

}

public class EmployeesSet {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(1, "amit"));
		employees.add(new Employee(1, "amit"));
		employees.add(new Employee(2, "neha"));
		employees.add(new Employee(3, "vishal"));

		for (Employee e : employees) {
			System.out.println(e.getEid() + " " + e.getName());
		}

		System.out.println("**********************");
		
		Set<Employee> emps = new TreeSet<Employee>();
		emps.add(new Employee(1, "amit"));
		emps.add(new Employee(1, "amit"));
		emps.add(new Employee(2, "neha"));
		emps.add(new Employee(3, "vishal"));

		for (Employee e : emps) {
			System.out.println(e);
		}

	}

}
