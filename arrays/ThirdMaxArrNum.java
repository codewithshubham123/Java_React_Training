package com.assignments.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdMaxArrNum {

	public static void main(String[] args) {

		// Topic Array: 1. To find third maximum number from list of numbers.
		Integer[] numarr = { 5, 6, 7, 1, 10, 2, 4, 8, 9 };

		// using array
		System.out.println("Third maximum number from array of numbers " + getThirdMaxNumFromArray(numarr));

		// using List
		System.out.println("Third maximum number from List of numbers " + getThirdMaxNumFromList(numarr));

	}

	private static int getThirdMaxNumFromArray(Integer[] numarr) {
		int nextNum;
		for (int i = 0; i < numarr.length; i++) {
			for (int j = i + 1; j < numarr.length; j++) {
				if (numarr[j] < numarr[i]) {
					nextNum = numarr[i];
					numarr[i] = numarr[j];
					numarr[j] = nextNum;
				}

			}
		}
		return numarr[numarr.length - 3];
	}

	private static int getThirdMaxNumFromList(Integer[] numarr) {
		List<Integer> numList = Arrays.asList(numarr);
		Collections.sort(numList);
		return numList.get(numList.size() - 3);
	}

}
