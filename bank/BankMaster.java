package com.assignments.bank;

abstract class Shape {
	abstract void draw();

	abstract void f1();
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing a triangle");

	}

	void f1() {
		System.out.println("In the fi method");
	}
}

class Square extends Shape {

	@Override
	void draw() {
		System.out.println("drawing a square");

	}

	void f1() {
		System.out.println("In the fi method");
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing a rectangle");

	}

	void f1() {
		System.out.println("In the fi method");
	}

}

public class BankMaster {

	public static void main(String[] args) {

		/*
		 * // Runtime Polymorphisum Shape[] shapes = { new Rectangle(), new Square(),
		 * new Triangle(), new Square() };
		 * 
		 * for (Shape s : shapes) { s.draw(); s.f1(); }
		 */

		Employee e1 = new Employee();
		try {
			e1.setEmail("axudb");
		} catch (EmailNotValidException e) {
			System.out.println(e.getMessage());
		}

		Employee e2 = new Employee();
		try {
			e2.setEmail("test@yash.com");
			System.out.println(e2.getEmail() + " is a valid email");
		} catch (EmailNotValidException e) {
			System.out.println(e.getMessage());
		}
//		Employee e2 = new ContractualEmployee(2, "Nisha", "It", "abc", 100, 90);
//		Employee e3 = new PermanentEmployee(1, "Vishal", "Hr", "iyt",700);
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
	}

}
