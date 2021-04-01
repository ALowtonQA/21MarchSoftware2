package com.qa.day2;

public class FlowCharts {
	
	public static void method1() {
		int a;
		for(a = 100; a <= 200; a++) {
			System.out.println(a);
		}
	}
	
	public static void method2() {
		int a;
		for (a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public static void method3() {
		for (int i=1; i <= 10; i++) {
			for (int y=1; y <= 10; y++) {
				System.out.println(i);
			}
		}
	}
	
	public static void method4() {
		for (int i=1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String[] args) {
		method4();
	}
	
}
