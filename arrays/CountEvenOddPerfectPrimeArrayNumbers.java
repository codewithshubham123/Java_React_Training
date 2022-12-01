package com.assignments.arrays;

public class CountEvenOddPerfectPrimeArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = { 5, 6, 7, 1, 10, 2, 4, 8, 9 };
		int evenNum = 0;
		int oddNum = 0;
		int perfectNum = 0;
		int primeNum = 0;
		for (int num : numArr) {

			//count of evenNumbers
			if (isEvenNumber(num))
				++evenNum;

			//count of oddNumbers
			if (isOddNumber(num))
				++oddNum;

			//count of perfectNumbers
			if (isPerfectNumber(num) == num)
				++perfectNum;

			//count of primeNumbers
			if (isPrimeNumber(num) == 0)
				++primeNum;

		}
		
		System.out.println(evenNum + " numbers are even");
		System.out.println(oddNum + " numbers are odd");
		System.out.println(perfectNum + " numbers are perfect");
		System.out.println(primeNum + " numbers are prime");
	}

	static boolean isEvenNumber(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	static boolean isOddNumber(int num) {
		if (num % 2 != 0)
			return true;
		else
			return false;
	}

	static int isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	static int isPrimeNumber(int num) {
		int i, mid = 0, flag = 0;

		mid = num / 2;
		if (num == 0 || num == 1) {
			flag = 1;
		} else {
			for (i = 2; i <= mid; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
		}
		return flag;
	}

}
