package com.qa.day5.game;

import java.util.Scanner;

public class Interface {
	
	private Hangman hm = new Hangman();
	
	public void setup() {
		hm.errors = 0;
		hm.clearLettersEntered();
		hm.setChosenWord();
		hm.setLettersFound();
	}
	
	public void playGame() {
		Scanner s = new Scanner(System.in);
		while (hm.errors < hm.END) {
//			For testing:			
//			System.out.println(hm.getChosenWord());
//			System.out.println(hm.getChosenWord().length());
			System.out.print("Enter a letter: ");
//			This ternary doesn't work correctly with scanner. Investigate?
//			String input = (s.next().length() > 1)? s.next().substring(0, 1) : s.next();
			String input = s.next().toLowerCase();
			
			if (input.length() > 1) {
				input = input.substring(0, 1).toLowerCase();
			}
			
			hm.check(input);
			System.out.println("\n"+hm.getLettersFoundFormatted());
			
			if (hm.isMatch()) {
				System.out.println("Correct! You win!");
				break;
			} else {
				System.out.println("---------------------------");
				System.out.println("You have " + (hm.END - hm.errors) + " lives remaining |");
				System.out.println("---------------------------\n");
			}
		
			if (hm.errors == hm.END) {
				System.out.println("You lost...");
				System.out.println("The word was: " + hm.getChosenWord());
				s.close();	
			}
		}
	}
}
