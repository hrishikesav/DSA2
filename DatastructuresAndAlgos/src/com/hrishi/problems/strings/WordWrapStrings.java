package com.hrishi.problems.strings;

public class WordWrapStrings {

	public static void main(String[] args) {
		
		String string = "Design a word wrap micro service which provides functionality to take an input string and wraps it so that none of the lines are longer than the max length. The lines should not break any word in the middle.";
		
		String result = wordWrap(string,23);
		
		System.out.println(result);
	}
	
	static String wordWrap(String string, int maxLength) {
		StringBuilder strBuilder = new StringBuilder();
		
		int wordCounter = 0;
		int spaceLeft = maxLength;
		StringBuilder words = new StringBuilder();

		for(int i=0; i<string.length(); i++) {
			if(Character.isWhitespace(string.charAt(i))) {
				
				if(wordCounter <= spaceLeft) {
					strBuilder.append(words);
					spaceLeft = spaceLeft - wordCounter;
				} else {
					strBuilder.append("\n").append(words);
					spaceLeft = maxLength - wordCounter;
				}
				
				words.setLength(0);
				wordCounter = 0;
				
				if(spaceLeft > 0) {
					strBuilder.append(string.charAt(i));
					spaceLeft--;
				} 
				else {
					words.append(string.charAt(i));
					wordCounter++;
				}
				
			} else {
				words.append(string.charAt(i));
				wordCounter++;
			}
		}
		
		if(words.length() <= spaceLeft) {
			strBuilder.append(words);
		} else {
			strBuilder.append("\n").append(words);
		}
		
		return strBuilder.toString();
	}

}
