package com.qa.day3;

public class Arrays {

	public static void method1 () {
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int value : values) {
			System.out.println(value);
		}
	}
	
	public static void method2() {
		int [] values = new int[10];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
			System.out.println(values[i]);
		}
		
		for (int value : values) {
			value = value * 10;
			System.out.println(value);
		}
	}
}
