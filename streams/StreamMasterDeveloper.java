package com.assignments.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.assignments.lambdaexpressions.Employee;

public class StreamMasterDeveloper {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "amit nigam", 31, "amit@gmail.com", "sales"),
				new Employee(2, "neha sharma", 32, "neha@gmail.com", "marketing"),
				new Employee(3, "vishal mathur", 25, "vishal@msn.com", "sales"),
				new Employee(4, "jatin nigam", 27, "vishal@rediff.com", "finance"));

		employees.stream().filter(a -> a.getDepartment().equalsIgnoreCase("sales"))
				.map(b -> b.getName().substring(0, b.getName().indexOf(" "))).forEach(System.out::println);
		;

		Optional<String> name = employees.stream().sorted((e1, e2) -> e2.getAge() - e1.getAge())
				.filter(a -> a.getDepartment().equalsIgnoreCase("sales")).map(e -> e.getName()).findFirst();

		System.out.println("Max age Employee of sales department =>" + name);

		int averageAge = employees.stream().collect(Collectors.averagingInt(e -> e.getAge())).intValue();
		System.out.println("Average age of all Employees => " + averageAge);

	}

}
