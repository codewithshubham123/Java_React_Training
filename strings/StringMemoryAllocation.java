package com.assignments.strings;

public class StringMemoryAllocation {

	public static void main(String[] args) {

		/*
		 * Topic String:- 6. WAP to demonstrate how memory is allocated to string
		 *                   objects in memory heap and string constant pool.
		 */

		// String created using String literal, it creates a new string object in the
		// String Constant Pool (String Constant Pool is also there inside Java Heap).
		String s1 = "Java";
		String s2 = "Java";

		// String created using 'new' keyword, it creates a new string object in the
		// Java heap.
		String s3 = new String("Java");
		// We can forcefully stop to creates a new string object in the Java heap by
		// using the intern() of the String class
		String s4 = new String("Java").intern();

		System.out.println((s1 == s2) + ", String are equal."); // true
		System.out.println((s1 == s3) + ", String are not equal."); // false
		System.out.println((s1 == s4) + ", String are equal."); // true

	}

}
