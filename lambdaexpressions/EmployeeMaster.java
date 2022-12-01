package com.assignments.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeMaster {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "amit", 31, "amit@gmail.com", "sales"),
				new Employee(2, "neha", 32, "neha@gmail.com", "marketing"),
				new Employee(3, "vishal", 25, "vishal@msn.com", "sales"),
				new Employee(4, "jatin", 27, "vishal@rediff.com", "finance"));
		NumMaster greater = (a) -> a > 30;
		for (Employee b : employees) {
			System.out.println(greater.checkNumber(b.getAge()) ? String.valueOf(b) + "  " : "  ");
		}
		System.out.println("Using Stream approach******");
		employees.stream().filter(a -> a.getAge() > 30).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("\n****** Find Employee as gmail user ******");
		ValidEmail email = (e) -> e.contains("@gmail.");
		for (Employee b : employees) {
			System.out.println(email.validateEmail(b.getEmail()) ? String.valueOf(b) + "  " : "  ");
		}

		System.out.println("\n****** Sorting String using comparator ******");
		List<String> friends = Arrays.asList("amit", "neha", "vishal", "jatin");
		friends.sort((n, m) -> n.compareTo(m));
		for (String str : friends) {
			System.out.print(str + " ");
		}

		System.out.println("\n******  Sorting Employee List using comparator by name ******");
		employees.sort((n, m) -> n.getName().compareTo(m.getName()));
		for (Employee emp : employees) {
			System.out.println(emp + " ");
		}

		System.out.println("\n******  Sorting Employee List using comparator by age ******");
		employees.sort((n, m) -> n.getAge() - m.getAge());
		for (Employee emp : employees) {
			System.out.println(emp + " ");
		}

		// Using predicate
		Predicate<Integer> lesserthan = i -> (i < 18);
		for (Employee emp : employees) {
			System.out.println(lesserthan.test(emp.getAge()) ? emp + "  " : "  ");
		}

		// using Function
//		Function<Employee, String> e1 = (a)->a.getId();

	}

}
