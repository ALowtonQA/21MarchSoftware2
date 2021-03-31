package com.qa.day1;

public class Results {
	
	int physicsResult;
	int chemResult;
	int bioResult;
	int total;
	String pf;
	
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
		double overallPercent = (total * 100) / 450;
		double physPercent = (physicsResult * 100) / 150;
		double chemPercent = (chemResult * 100) / 150;
		double bioPercent = (bioResult * 100) / 150;
		System.out.println("Percentage: " + overallPercent + " %\n");
		if (overallPercent >= 60 && physPercent >= 60 && chemPercent >= 60 && bioPercent >= 60) {
			System.out.println("\nResult: PASS");
		} else {
			double pcnts[] = {physPercent, chemPercent, bioPercent};
			for (int i = 0; i < pcnts.length; i++) {
				if (pcnts[i] < 60) {
					if (i == 0) {
						System.out.println("Physics: FAIL");
					} else if (i == 1) {
						System.out.println("Chemistry: FAIL");
					} else {
						System.out.println("Biology: FAIL");
					}
				}
			}
			System.out.println("\nOverall Result: FAIL");
		}
	}
}
