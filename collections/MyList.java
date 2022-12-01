package com.assignments.collections;

import com.assignments.model.Student;

class Node<T> {
	T data;
	Node<T> next;
	public Node(T data) {
		this.data = data;
		this.next = null;
	}

}

public class MyList<T> {
	Node<T> start;

	public MyList() {
		start = null;
	}

	public void addInStart(T data) {
		Node<T> newNode = new Node<T>(data);
		if (start != null) {
			newNode.next = start;
		}
		start = newNode;
	}
	

	public void displayList() {
		Node<T> temp;
		temp = start;
		while (temp != null) {
			System.out.println(temp.data + " => ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		MyList<String> arr = new MyList<String>();
		arr.addInStart("amit");
		arr.addInStart("neha");
		arr.addInStart("vishal");
		arr.displayList();
		
		System.out.println("===========================");
		
		MyList<Student> student = new MyList<Student>();
		student.addInStart(new Student(1, "amit", 11));
		student.addInStart(new Student(2, "neha", 13));
		student.addInStart(new Student(3, "vishal", 18));
		student.displayList();
		
		System.out.println("===========================");
	}

}
