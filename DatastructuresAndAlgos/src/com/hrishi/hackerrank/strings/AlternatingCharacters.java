package com.hrishi.hackerrank.strings;

public class AlternatingCharacters {

	public static void main(String[] args) {
		
		String str = "AAABBB";
		System.out.println(alternatingCharacters(str));
	}
	
	static int alternatingCharacters(String s) {
		int count = 0;
		char prevChar = s.charAt(0);
		
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == prevChar) {
				count++;
			} else {
				prevChar = s.charAt(i);
			}
		}
		return count;
	}

}
