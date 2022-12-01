package com.assignments.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamDeveloper {
	public static void main(String[] args) {
		List<Integer> lArr = Arrays.asList(1, 2, 4, 9, 8, 7, 5);

//		lArr.stream().forEach(i -> System.out.print(i + " "));
//		lArr.stream().filter(a -> a % 2 == 0).forEach(i -> System.out.print(i + " "));

		// Square of Even number
//		lArr.stream().filter(a -> a % 2 == 0).map(p -> p * p).forEach(i -> System.out.print(i + " "));

//		lArr.stream().forEach(System.out::print);

		// Factorial of all odd number

		Function<Integer, Integer> factorial = (a) -> {
			/*
			 * int factor = 1; for (int i = 1; i <= a; i++) factor = factor * i; return
			 * factor;
			 */
			// using reduce function
			return IntStream.range(1, a + 1).reduce(1, (x, y) -> x * y);
		};

		lArr.stream().filter(a -> a % 2 != 0).map(x -> factorial.apply(x)).forEach(x -> System.out.print(x + " "));
		System.out.println("\n The greatest element in array => " + lArr.stream().reduce(1, (x, y) -> (x > y ? x : y)));
		System.out.println("\n The smallest element in array => " + lArr.stream().reduce(1, (x, y) -> (x < y ? x : y)));
	}
}
