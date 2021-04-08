package com.qa.day5.game;

import java.util.ArrayList;
import java.util.Random;

public class Hangman {
	// Got words from random generator online. Find a better way for a larger set.
	private final String[] DICT = {
			"bone", "rice", "chemical", "decide", "functional", "festive", "share", "mouth",
			"manage", "innate", "parched", "rustic", "eatable", "purple", "rabbits", "billowy",
			"upbeat", "cook", "pray", "suspicious", "abusive", "fade", "rose", "acoustics",
			"jeans", "beneficial", "spray", "creation", "absolutely", "tiny"
	};
	
	private final Random R = new Random();
	public final int END = 7;
	private ArrayList<String> lettersEntered = new ArrayList<>();
	private String chosenWord;
	private char[] lettersFound;
	public int errors;
	
	public boolean isMatch() {
		String lettersFound = new String(this.lettersFound);
		return this.chosenWord.contentEquals(lettersFound);
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
			this.errors++; // Improve this so that repeated errors don't stack.
		}
		this.lettersEntered.add(c);
	}

	public void setChosenWord() {
		int limit = DICT.length;
		int rng = R.nextInt(limit);
		this.chosenWord = DICT[rng];
	}
	
	public void setLettersFound() {
		this.lettersFound = new char[this.chosenWord.length()];
		for (int i = 0; i < this.lettersFound.length; i++) {
			lettersFound[i] = '_';
		}
	}

	public void clearLettersEntered() {
		this.lettersEntered.clear();
	}
	
	public String getChosenWord() {
		return this.chosenWord;
	}
	
	public char[] getLettersFound() {
		return this.lettersFound;
	}
	
	public String getLettersFoundFormatted() {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < this.lettersFound.length; i++) {
			output.append(this.lettersFound[i]);
			if (i < this.lettersFound.length - 1)
				output.append(" ");
		}
		return output.toString();
	}
}
