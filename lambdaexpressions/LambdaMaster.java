package com.assignments.lambdaexpressions;

import java.util.function.Predicate;

@FunctionalInterface
interface MyApp {
	int operation(int a);

//	boolean checkAge(int age);
}

@FunctionalInterface
interface NumMaster {

	boolean checkNumber(int age);
}

@FunctionalInterface
interface EvenOrOdd {

	int checkNumber(int num);
}

@FunctionalInterface
interface ValidEmail {

	boolean validateEmail(String email);
}

@FunctionalInterface
interface SortNames {

	int sortNames(String name1, String name2);
}

public class LambdaMaster {

	public static void main(String[] args) {
//		MyApp myApp = new MyApp() {
//
//			@Override
//			public int operation(int a, int b) {
//				return a + b;
//			}
//
////			@Override
////			public boolean checkAge(int age) {
////				return age > 18;
////			}
//		};
//
//		System.out.println(myApp.operation(5, 6));
////		System.out.println(myApp.checkAge(6));
//
//		// Using Lambda Expression
//
////one way =>		MyApp a2 = (int a, int b) -> {return a + b;};
//		// second way => MyApp a2 = (int a, int b) -> a + b;
		MyApp sum = (a) -> a++;
//		System.out.println(sum.operation(5, 4));
//
//		MyApp sub = (a, b) -> a - b;
//		System.out.println(sub.operation(5, 4));
//
//		MyApp mul = (a, b) -> a * b;
//		System.out.println(mul.operation(5, 4));
//
//		MyApp div = (a, b) -> a / b;
//		System.out.println(div.operation(5, 4));

		int arr[] = { 1, 12, 13, 21, 22, 24, 11, 15, 19, 17 };

		NumMaster greater = (a) -> a > 18;
		for (int b : arr) {
			System.out.print(greater.checkNumber(b) ? String.valueOf(b) + "  " : "  ");
		}

		EvenOrOdd even = (a) -> a % 2 == 0 ? a : 0;
		int s = 0;
		for (int b : arr) {
			s += even.checkNumber(b);
		}

		System.out.println(s + "  ");
		
		//Using predicate
		Predicate<Integer> lesserthan = i -> (i < 18);
		for (int b : arr) {
			System.out.print(lesserthan.test(b) ? b + "  " : "  ");
		}
	}

}
