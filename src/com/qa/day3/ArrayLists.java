package com.qa.day3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<>();
		test.add("one");
		test.add("two");
		test.add("three");
		test.add("four");
		System.out.println(test);
		////////////////////
		// Normal Loop
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
		///////////////////
		// Enhanced
		for (String entry : test) {
			System.out.println(entry);
		}
		
		//////////////////
		// Get/set/remove
		System.out.println("\n");
		System.out.println(test.get(0));
		test.set(0, "1");
		System.out.println(test.get(0));
		test.remove(0);
		System.out.println(test.get(0));
		
		//////////////////
		// Sort
		System.out.println("\n");
		test.add("a");
		test.add("b");
		test.add("z");
		Collections.sort(test);
		System.out.println(test);
		
		//////////////////
		// Reverse/swap
		System.out.println("\n");
		Collections.reverse(test);
		System.out.println(test);
		Collections.swap(test, 0, 1);
		System.out.println(test);
	}	
}
