package com.assignments.arrays;

import java.util.HashMap;

public class PythagorusTheorum {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 6, 5, 9, 10, 12, 13, 15, 24, 26, 30 };
		int n = arr.length;
		String result = getPythagorusTemplate(arr, n);
		if (result != null)
			System.out.print(result);
		else
			System.out.print("No Pythagorus Template found in givan array");

	}

	static String getPythagorusTemplate(int arr[], int n) {

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				continue;
			if (hashMap.containsKey(arr[i]))
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			else
				hashMap.put(arr[i], 1);
		}
		String pythagorusTempalte = null;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int c = (int) Math.sqrt(arr[i] * arr[i] + arr[j] * arr[j]);
				float d = (float) Math.sqrt(arr[i] * arr[i] + arr[j] * arr[j]);

				if (c == d && hashMap.get(c) != 0) {

					if (pythagorusTempalte == null)
						pythagorusTempalte = "";

					pythagorusTempalte += "Found Pythagorus Tempalte as => " + arr[i] + "*" + arr[i] + " + " + arr[j]
							+ "*" + arr[j] + " = " + c + "*" + c + "\n";
				}
			}
		}

		return pythagorusTempalte;
	}

}
