package com.assignments.strings;

import java.util.Scanner;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// 3. To remove all the vowels from the given string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");

		try {
			String str = scan.nextLine();

			if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
				str = str.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "")
						.replaceAll("u", "");
			}

			System.out.println("String " + str + " after removing all the vowels => " + str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
