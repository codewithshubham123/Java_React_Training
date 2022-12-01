package com.assignments.strings;

public class PerformanceTestForString {

	public static void main(String[] args) {

		// Topic Strings :
		// 5. To demonstrate which is fast in processing StringBuilder or StringBuffer

		long startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Assignments");
		for (int i = 0; i < 10000; i++) {
			sb2.append("For Training.");
		}
		long timeTakenByStringBuilder = System.currentTimeMillis() - startTime;
		System.out.println("Time taken by StringBuilder: " + timeTakenByStringBuilder + "ms");

		startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Assignments");
		for (int i = 0; i < 10000; i++) {
			sb.append("For Training.");
		}
		long timeTakenByStringBuffer = System.currentTimeMillis() - startTime;
		System.out.println("Time taken by StringBuffer: " + timeTakenByStringBuffer + "ms");

		if (timeTakenByStringBuffer < timeTakenByStringBuilder) {
			System.out.println("StringBuffer is fast in processing");
		} else {
			System.out.println("StringBuilder is fast in processing");
		}
	}

}
