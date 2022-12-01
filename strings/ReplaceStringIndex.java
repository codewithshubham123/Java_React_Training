package com.assignments.strings;

import java.util.Scanner;

public class ReplaceStringIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Strings : ");
//		scan.nextLine();
		String[] string = new String[3];

		try {
			for (int i = 0; i < 3; i++) {
				string[i] = scan.nextLine();
				if (string[i].equals("")) {
					System.out.println("\nPlease enter the appropriate input");
					break;
				}
			}

			if (!string[2].equals("") && Integer.parseInt(string[2]) <= string[0].length()) {
				System.out.println(
						"resultant string => " + string[0].substring(0, Integer.parseInt(string[2])).concat(string[1])
								.concat(string[0].substring(Integer.parseInt(string[2]), string[0].length())));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

}
