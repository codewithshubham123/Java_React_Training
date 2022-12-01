package com.assignments.arrays;

public class SortingStrByLenInArr {

	public static void main(String[] args) {
		//Topic Array : You are having array of strings. 
		//				Now you have to arrange strings in array on the basis of the length of each string. 
		//				Smallest string will be first and so on. 
		String[] strArr = { "are", "in", "because", "extract", "palindrome", "setup", "that" };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[j].length() < strArr[i].length()) {
					String nextChar = strArr[j];
					strArr[j] = strArr[i];
					strArr[i] = nextChar;
				}

			}
		}

		for (String str : strArr) {
			System.out.println(str);
		}

	}

}
