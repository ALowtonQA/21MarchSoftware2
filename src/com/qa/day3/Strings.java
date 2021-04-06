package com.qa.day3;

public class Strings {

	static String one = "yesterday it was raining";
	static String two = "today it is sunny";
	static String output = two.toUpperCase() + ", " + one.toUpperCase();
	
	public static void subStr() {
		String sub1 = two.substring(0, 11);
		String sub2 = one.substring(16, 24);
		System.out.println((sub1 + sub2).toUpperCase());
	}
	
	public static int method1(String x) {
		int wordCount = 0;
		String input = x.strip();
		for (int i = 0; i < input.length(); i++) {
			char thisChar = input.charAt(i);
			char nextChar = (i + 1 < input.length())? input.charAt(i + 1) : 0;
			
			if (thisChar == ' ' && nextChar != 0 && nextChar != ' ') {
				wordCount++;
			}
			
			// Case for last word in string
			if (nextChar == 0) {
				wordCount++;
			}
		}
		return wordCount;
	}
	
	public static void method2(String x) {
		String input = x.strip();
		String output = input.replace(' ', '\n');
		System.out.println(output);
	}
	
	public static void method3(String x) {
		StringBuilder input = new StringBuilder();
		input.append(x);
		input.reverse();
		method2(input.toString());
	}
	
	public static boolean method4(String message, String search) { 
		return (message.contains(search))? true : false;
	}
}
