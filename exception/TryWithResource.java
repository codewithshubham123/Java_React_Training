package com.assignments.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*3) WAP to demonstrate use of try with resources.*/
public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}

}
