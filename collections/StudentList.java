package com.assignments.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.assignments.model.Student;

public class StudentList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "Trupti", 11));
		list.add(new Student(1, "Trupti", 19));
		list.add(new Student(2, "Rucha", 12));
		list.add(new Student(3, "Neha", 13));
		list.add(new Student(4, "Shree", 14));
		list.add(new Student(5, "Swati", 15));
		list.add(new Student(6, "Rekha", 16));
		list.add(new Student(7, "Lalit", 17));

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});

		for (Student s : list) {
			System.out.println(s + "");
		}

		System.out.println("************");

		System.out.println("Highest age => " + list.get(list.size() - 1).getAge());

	}

}
