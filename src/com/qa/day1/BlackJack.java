package com.qa.day1;

public class BlackJack {
		
	public static int play(int a, int b) {
		if (a <= 21 || b <= 21) {
			int diffA = 21 - a;
			int diffB = 21 - b;
			if ((diffA > 0 && diffA <= diffB) || diffB < 0) {
				return a;
			} else {
				return b;
			}		
		} else {
			return 0;
		}
	}
}
