package com.assignments.arrays;

import java.util.Scanner;

public class SegragateArrayonVowels {

	public static void main(String[] args) {
		// 7. You are given a sequence of Character in the form of Array. Now you have
		// to put all vowels and consonants together in the array.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");

		try {
			String str = scan.nextLine();
			System.out.println("Original string " + str);
			char[] charArr = str.toCharArray();

			char nextChar;
			for (int i = 0; i < charArr.length; i++) {
				for (int j = i + 1; j < charArr.length; j++) {
					if (charArr[j] == 'a' || charArr[j] == 'e' || charArr[j] == 'i' || charArr[j] == 'o'
							|| charArr[j] == 'u') {
						nextChar = charArr[i];
						charArr[i] = charArr[j];
						charArr[j] = nextChar;
					}

				}
			}
			System.out.println("Segregation of string " + str + " on vowels => ");
			System.out.println(charArr);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
