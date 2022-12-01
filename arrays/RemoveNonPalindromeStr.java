package com.assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNonPalindromeStr {

	public static void main(String[] args) {
		
		String[] strArr = { "radar", "fuzz", "deed", "test" };
		
		List<String> strList = new ArrayList<String>(Arrays.asList(strArr));
		
		for (int x = 0; x < strList.size(); x++) {
			String reverseStr = "";
			String originlStr = strList.get(x);
			for (int i = originlStr.length() - 1; i >= 0; i--) {
				reverseStr += originlStr.charAt(i);
			}
			if (!reverseStr.equalsIgnoreCase(originlStr))
				strList.remove(originlStr);
		}

		strList.forEach(System.out::println);
	}

}
