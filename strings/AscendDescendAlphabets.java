package com.assignments.strings;

import java.util.Scanner;

public class AscendDescendAlphabets {

	public static void main(String[] args) {

		// 2. To print the all alphabets of string in ascending and descending order.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		try {
			String str = scan.nextLine();
			System.out.println(str);

			char[] strArr = str.toCharArray();

			char nextChar;
			for (int i = 0; i < strArr.length; i++) {
				for (int j = i + 1; j < strArr.length; j++) {
					if (strArr[j] < strArr[i]) {
						nextChar = strArr[i];
						strArr[i] = strArr[j];
						strArr[j] = nextChar;
					}

				}
			}
			System.out.println("All alphabets of string " + str + " in ascending => ");
			System.out.println(strArr);
			for (int i = 0; i < strArr.length; i++) {
				for (int j = i + 1; j < strArr.length; j++) {
					if (strArr[j] > strArr[i]) {
						nextChar = strArr[j];
						strArr[j] = strArr[i];
						strArr[i] = nextChar;
					}

				}
			}

			System.out.println("All alphabets of string " + str + " in descending => ");
			System.out.println(strArr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
