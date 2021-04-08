package com.qa.day5.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	private final String[] DICT = {
			"bone", "rice", "chemical", "decide", "functional", "festive", "share", "mouth",
			"manage", "innate", "parched", "rustic", "eatable", "purple", "rabbits", "billowy",
			"upbeat", "cook", "pray", "suspicious", "abusive", "fade", "rose", "acoustics",
			"jeans", "beneficial", "spray", "creation", "absolutely", "tiny"
	};
	
	private final Random R = new Random();
	private final int END = 7;
	private ArrayList<String> lettersEntered = new ArrayList<>();
	private String chosenWord;
	private char[] lettersFound;
	private int errors;
	
	public String chooseWord() {
		int limit = DICT.length;
		int rng = R.nextInt(limit);
		return DICT[rng];
	}
	
	public boolean isMatch() {
		String lettersFound = new String(this.lettersFound);
		return chosenWord.contentEquals(lettersFound);
	}
	
	public void setup() {
		this.errors = 0;
		this.lettersEntered.clear();
		this.chosenWord = chooseWord();
		this.lettersFound = new char[this.chosenWord.length()];
		
		for (int i = 0; i < this.lettersFound.length; i++) {
			lettersFound[i] = '_';
		}
	}
	
	public void check(String c) {
		char ch = c.charAt(0);
		if (!this.lettersEntered.contains(c) && this.chosenWord.contains(c)) {
			int i = this.chosenWord.indexOf(c);
			while (i != -1) {
				this.lettersFound[i] = ch;
				i = this.chosenWord.indexOf(c, i+1);
			}
		} else {
			this.errors++;
		}
		lettersEntered.add(c);
	}
	
	public void play() {
		Scanner s = new Scanner(System.in);
		while (errors < END) {
			System.out.println("Enter a letter: ");
			String input = (s.next().length() > 1)? s.next().substring(0, 1) : s.next();
			check(input);
			System.out.println(lettersFound.toString());
			
			if (isMatch()) {
				System.out.println("Correct! You win!");
				break;
			} else {
				System.out.println("You have " + (END - errors) + " lives remaining.");
				continue;
			}
			
		}
	}
}
