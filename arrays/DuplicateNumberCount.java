package com.assignments.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateNumberCount {

	public static void main(String[] args) {
		// Topic Array: 2. To find duplicate numbers and there counting from list of
		// numbers.

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 2, 3, 4, 6, 8, 9, 2);

		Map<Integer, Integer> numberMap = new HashMap<>();
		for (int num : numberList) {

			if (numberMap.containsKey(num)) {
				int count = numberMap.get(num);
				numberMap.put(num, ++count);
			} else {
				numberMap.put(num, 1);
			}
		}

		numberMap.forEach((key, value) -> {
			if (value > 1)
				System.out.println("Number " + key + " repeated " + value+" times.");
		});
	}

}
