package com.assignments.collections;

import com.assignments.model.Student;

public class MyGenericType<T> {
	T a;
	T b;

	public MyGenericType(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public boolean isValueEqual() {
		return a.equals(b);
	}

	public static void main(String[] args) {
		MyGenericType<String> m1 = new MyGenericType<String>("abc", "xyz");
		System.out.println(m1.isValueEqual());

		MyGenericType<Integer> m2 = new MyGenericType<Integer>(12, 12);
		System.out.println(m2.isValueEqual());

		MyGenericType<Student> m3 = new MyGenericType<Student>(new Student(1, "amit", 21), new Student(1, "amit", 12));
		System.out.println(m3.isValueEqual());
	}

}
