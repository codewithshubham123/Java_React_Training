package com.assignments.strings;

public class JavaGarbageCollectorDemo {

	/*
	 * Topic String:- 7. WAP to demonstrate how garbage collector work when any
	 * memory is not referenced by string object.
	 */

	public static void main(String[] args) {
		String str1 = new String("String1");
		System.out.println(str1 + " ");
		str1 = null;// unreferencing string object

		String str2 = "String2";
		System.out.println(str2 + " ");
		str2 = null;// unreferencing string object

		
		//By assigning a reference to another
		String str3 = new String("String3");
		System.out.println(str3 + " ");

		String str4 = "String4";
		System.out.println(str4 + " ");
		str3 = str4; // now the first object referred by str3 is available for garbage collection
		
		
		System.gc();
		System.out.println("Garbage collector is called");
		
		
		
	}
}
