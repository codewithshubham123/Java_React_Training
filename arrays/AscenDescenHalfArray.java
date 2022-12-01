package com.assignments.arrays;

public class AscenDescenHalfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = { 3, 2, 6, 98, 42, 80, 23, 11, 67, 88, 1, 2, 5, 50 };

		System.out.println(" Original array => \n");
		for (int num : numArr)
			System.out.print(num + " ");
		
		int nextNo;
		for (int i = 0; i < (numArr.length) / 2; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[j] < numArr[i]) {
					nextNo = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = nextNo;
				}

			}
		}
		System.out.println("\n ******** \n\n First Half array in ascending order =>\n ");
		for (int num : numArr)
			System.out.print(num + " ");

		for (int i = (numArr.length) / 2; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[j] > numArr[i]) {
					nextNo = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = nextNo;
				}

			}
		}

		System.out.println("\n ******** \n\n With Second Half array in descending order =>\n ");
		for (int num : numArr)
			System.out.print(num + " ");
	}

}
