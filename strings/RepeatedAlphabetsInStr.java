package com.assignments.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedAlphabetsInStr {

	public static void main(String[] args) {
		// 4. To print the number of alphabets repeated in the given string.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");

		String str = scan.nextLine();
		int numberOfAlphabetsRepeated = 0;

		try {
			char[] charArr = str.toCharArray();
			char[] repeatedAlpha = new char[charArr.length];
			Map<Character, Integer> charMap = new HashMap<>();
			for (char ch : charArr) {

				if (charMap.containsKey(ch)) {
					int count = charMap.get(ch);
					if (count == 1) {
						repeatedAlpha[numberOfAlphabetsRepeated] = ch;
						++numberOfAlphabetsRepeated;
					}
					charMap.put(ch, ++count);
				} else {
					charMap.put(ch, 1);
				}
			}

			System.out.println("Number of alphabets repeated => " + numberOfAlphabetsRepeated);
			System.out.println("alphabets repeated are => ");
			System.out.println(repeatedAlpha);

			charMap.forEach((key, value) -> System.out.println("Alphabet => " + key + " : Repeated count => " + value));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
