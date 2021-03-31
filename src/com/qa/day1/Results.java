package com.qa.day1;

public class Results {
	
	int physicsResult;
	int chemResult;
	int bioResult;
	int total;
	
	public Results(int p, int c, int b) {
		physicsResult = p;
		chemResult = c;
		bioResult = b;
		total = physicsResult + chemResult + bioResult;
	}
	
	public void displayResults() {
		System.out.println("------------------\nYour results are:\n------------------");
		System.out.println("Physics:      " + physicsResult);
		System.out.println("Chemistry:    " + chemResult);
		System.out.println("Biology:      " + bioResult);
		System.out.println("Total Result: " + total + "\n------------------");
	}
	
	public void showPercentage() {
		double percent = (total * 100) / 450;
		System.out.println("Percentage: " + percent + " %");
	}
}
