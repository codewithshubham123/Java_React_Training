package com.assignments.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		try {
			String str = scan.nextLine();
			System.out.println(str);

			List<String> list = new ArrayList<String>();
			list.add("Trupti");
			list.add("Neha");
			list.add("Rucha");
			list.add("Sweta");
			list.add("Saroj");
			list.add("Neeraj");
			list.add("Nikhil");

			Collections.sort(list);
			if (list.indexOf(str) != -1) {
				System.out.println(str + " is present in the list");
			} else {
				System.out.println(str + " is not present in the list");
			}

//		for (String str : list)
//			System.out.println(str + "  ");

//		System.out.println("****************");
//		Iterator<String> iterator = list.listIterator();
//		while (iterator.hasNext()) {
//			String name = iterator.next();
//				System.out.println(name);
//		}
//		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
