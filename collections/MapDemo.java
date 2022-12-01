package com.assignments.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("amit", 21);
		map.put("saroj", 22);
		map.put("neha", 20);
		map.put("jatin", 23);

		System.out.println("The age of Neha is " + map.get("neha"));

		System.out.println("**********************");

		for (String s : map.keySet()) {
			System.out.println("The age of " + s + " is " + map.get(s));
		}
		
		System.out.println("**********************");

		for (Entry<String, Integer> s1 : map.entrySet()) {
			System.out.println("The age of " + s1.getKey() + " is " + s1.getValue());
		}
	}

}
