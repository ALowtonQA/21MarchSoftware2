package com.qa.day2;

public class Numbers {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(method2(i));
		}
	}
	
	public static void method1 (int input) {
		int sum = 0;
		while (input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		System.out.println(sum);
	}
	
	public static String method2 (int input) {
			
		if (input <= 0) {
			System.out.println("ERROR: Zero & less not supported");
			return "";
		}
		
		if (input > 999) {
			System.out.println("ERROR: Input must be less than 999");
			return "";
		}
		
		String[] units = new String[] {
			"", " one", " two", " three", " four", " five", " six",
			" seven", " eight", " nine"
		};
		
		String[] teens = new String[] {
			" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen",
			" sixteen", " seventeen", " eighteen", " nineteen"
		};
		
		String [] tens = new String[] {
			"", "", " twenty", " thirty", " forty", " fifty",
		    " sixty", " seventy", " eighty", " ninety"
		};
		
		String word = "";
		int n = input % 100;
		
		if (n < 10) {
			word = word + units[n];
		} else if (n < 20) {
			word = word + teens[n%10];
		} else {
			word = tens[n/10] + units[n%10];
		}
		
		word = (input/100 > 0)? units[input/100] + " hundred" + word : word;
		return word;
	}
}
