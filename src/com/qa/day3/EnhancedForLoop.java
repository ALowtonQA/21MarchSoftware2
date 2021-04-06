package com.qa.day3;

import java.util.stream.IntStream;

public class EnhancedForLoop {
	
	static int[] numbers = IntStream.rangeClosed(1, 20).toArray();
	
	public static void method1() {
		String[] words = {"one", "two", "three"};
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	public static void method2() {
		for (int number : numbers) {
			System.out.println(number * number);
		}
	}
	
	public static boolean isEven(int x) {
		if (x % 2 == 0) return true;
		return false;
	}
	
	public static void method3() {
		for (int number : numbers) {
			if (isEven(number)) {
				System.out.println(number * number * number);
			} else {
				System.out.println(number * number);
			}
		}
	}
}
