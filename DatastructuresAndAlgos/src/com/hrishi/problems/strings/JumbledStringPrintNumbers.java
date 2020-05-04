package com.hrishi.problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumbledStringPrintNumbers {
	
	enum NUMBERS {
		zero(0),one(1),two(2),three(3),four(4),five(5),six(6),seven(7),eight(8),nine(9);
		
		private int value;
		
		public int getValue() {
			return this.value;
		}
		
		public static int getValueForString(String str) {
			return NUMBERS.valueOf(str).getValue();
		}
		
		private NUMBERS(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		
		String jumbledStr = "rzeosdfweweeethrnin";
		String[] dictionary = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		List<String> numberWords = getWordsFromString(jumbledStr, dictionary);
		for(String s : numberWords) {
			System.out.print(getNumberForWord(s) + " ");
		}
		
	}
	
	static List<String> getWordsFromString(String jumbledStr, String[] dictionary) {
		List<String> words = new ArrayList<>();
		int[] charCount = new int[26];
		for(char c : jumbledStr.toCharArray()) {
			charCount[c-'a']++;
		}
		
		for(String str : dictionary) {
			int[] tempCharCount = Arrays.copyOf(charCount, charCount.length);
			boolean strFound = true;
			for(char c : str.toCharArray()) {
				if(tempCharCount[c-'a'] > 0) {
					tempCharCount[c-'a']--;
				} else {
					strFound = false;
					break;
				}
			}
			if(strFound) {
				words.add(str);
				charCount = tempCharCount;
			}
		}
		return words;
	}
	
	static int getNumberForWord(String str) {
		int num = -1;
		try {
			num = NUMBERS.getValueForString(str);
		} catch(IllegalArgumentException e) {
		}
		return num;
	}

}
