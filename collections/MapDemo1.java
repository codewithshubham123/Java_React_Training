package com.assignments.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo1 {

	public static void main(String[] args) {
		// Get the frequency of all the elements in the array
		int[] arr = { 1, 2, 3, 1, 3, 2, 1, 5, 4, 5, 1, 2, 3, 1 };
		Map<Integer, Integer> frequencymap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {

			if (frequencymap.containsKey(arr[i])) {
				int count = frequencymap.get(arr[i]);
				frequencymap.put(arr[i], ++count);
			} else {
				frequencymap.put(arr[i], 1);
			}

		}

		// Displays the frequency of each element present in array
		for (Entry<Integer, Integer> fr : frequencymap.entrySet()) {
			System.out.println("The frequency of " + fr.getKey() + "  is  " + fr.getValue());
		}
	}
}
