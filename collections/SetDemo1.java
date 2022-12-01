package com.assignments.collections;

import java.util.HashSet;

public class SetDemo1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 2, 1, 5, 6, 8, 7, 5 };
		HashSet<Integer> hashset = new HashSet<>();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				hashset.add(arr[i]);
			} else {
				if (hashset.contains(arr[i])) {
					hashset.add(arr[i]);
				}
			}
		}
	}

}
