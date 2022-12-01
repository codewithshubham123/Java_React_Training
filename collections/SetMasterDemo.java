package com.assignments.collections;

import java.util.HashSet;
import java.util.Set;

public class SetMasterDemo {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("amit");
		set1.add("neha");
		set1.add("amit");
		set1.add("jatin");

		for (String s : set1)
			System.out.println(s + " ");

		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(5);
		set2.add(8);

		set2.add(9);
		set2.add(6);
		set2.add(5);
		set2.add(8);

		set2.addAll(set3);
		
		for (int s : set2)
			System.out.println(s);
		
		set2.retainAll(set3);
		for (int s : set2)
			System.out.println(s);
		
		
		Set<String> chemistry = new HashSet<String>();
		chemistry.add("amit");
		chemistry.add("Vishal");
		chemistry.add("neha");
		
		Set<String> physics = new HashSet<String>();
 		physics.add("amit");
 		physics.add("nidhi");
 		physics.add("neha");
 		
 		chemistry.removeAll(physics);
 		for (String s : chemistry)
			System.out.println(s);
 		
 		chemistry.addAll(physics);
 		for (String s : chemistry)
			System.out.println(s);
 		
	}

}
