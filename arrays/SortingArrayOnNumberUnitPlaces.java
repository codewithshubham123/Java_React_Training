package com.assignments.arrays;

public class SortingArrayOnNumberUnitPlaces {

	public static void main(String[] args) {
		// Topic Array: 10. To sort array on the basis of unit place. For example we are
		// having following numbers:- 10,2,3,41,12,13,19,81,9. Output will be
		// 10,41,81,2,12,3,13,19,9

		int[] numArr = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
		for (int i = 0; i < numArr.length; i++) {
			int x = numArr[i] % 10;
			for (int j = i + 1; j < numArr.length; j++) {
				int y = numArr[j] % 10;
				if (x > y) {
					int nextNum = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = nextNum;
				}
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			int x = numArr[i] % 10;
			for (int j = i + 1; j < numArr.length; j++) {
				int y = numArr[j] % 10;
				if (x == y) {
					int nextNum = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = nextNum;
				}
			}
		}

		for (int num : numArr)
			System.out.print(num + " ");
	}

}
