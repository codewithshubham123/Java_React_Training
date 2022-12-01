package com.assignments.lambdaexpressions;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ValidateEmailAndMobNumUsingPredicate {

	public static void main(String[] args) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
		String mobileNumRegex = "^\\\\d{10}$";

		Predicate<String> p1 = (a) -> Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE).matcher(a).find();
		System.out.println(p1.test("trupti@yash.com"));

		Predicate<String> p2 = (b) -> Pattern.compile(mobileNumRegex, Pattern.CASE_INSENSITIVE).matcher(b).find();
		System.out.println(p2.test("98230090990"));

	}

}
