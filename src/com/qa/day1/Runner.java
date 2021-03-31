package com.qa.day1;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			try {
// Calculator block	
				System.out.println("Enter two integers:");
				int a = s.nextInt();
				int b = s.nextInt();
				int result1 = Calculator.add(a, b);
				int result2 = Calculator.mul(a, b);
				int result3 = Calculator.sub(a, b);
				double result4 = Calculator.div(a, b);			
				System.out.println(result1);
				System.out.println(result2);
				System.out.println(result3);
				System.out.println(result4);
			} catch (Exception e) {
				System.out.println("\nERROR: Please enter an integer value!");
				s.next(); // IMPORTANT: Clears wrong input from scanner before continuing to prevent endless loop.
				continue;
			}
// Exam results block
				boolean flag = false;
				int chem;
				int phys;
				int bio;
				System.out.println("\nPlease enter your exam results.");
				do {
					System.out.println("Physics: ");
					phys = s.nextInt();
					if(phys <= 150) {
						flag = true;
					} else {
						System.out.println("\nERROR: Score must be an integer less than or equal to 150! Try Again.");
					}
				}
				while (!flag);
				flag = false;
				do {
					System.out.println("Chemistry: ");
					chem = s.nextInt();
					if(chem <= 150) {
						flag = true;
					} else {
						System.out.println("Score must be an integer less than or equal to 150!");
					}
				}
				while (!flag);
				flag = false;
				do {
					System.out.println("Biology: ");
					bio = s.nextInt();
					if(bio <= 150) {
						flag = true;
					} else {
						System.out.println("Score must be an integer less than or equal to 150!");
					}
				}
				while (!flag);
			
				Results resObj = new Results(phys, chem, bio);
				resObj.displayResults();
				resObj.showPercentage();
				s.close();
				break;
		}
// Decimal Format block
//		DecimalFormatter d = new DecimalFormatter(".######");
//		System.out.println(d.format(2.45677435345));
	}
}
