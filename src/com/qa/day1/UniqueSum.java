package com.qa.day1;

public class UniqueSum {
	
	public static int input (int a, int b, int c) {
		if (a == b && a == c) {
			return 0;
		} else if (a == b) {
			return c;
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		} else {
			return a + b + c;
		}
	}
}
