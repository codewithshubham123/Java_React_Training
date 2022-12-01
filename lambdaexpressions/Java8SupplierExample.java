package com.assignments.lambdaexpressions;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java8SupplierExample {

	public static void main(String[] args) {
		Supplier<Integer> randomNumbersSupp = () -> new Random().nextInt(10);
		Stream.generate(randomNumbersSupp).limit(5).forEach(System.out::print);

	}

}
