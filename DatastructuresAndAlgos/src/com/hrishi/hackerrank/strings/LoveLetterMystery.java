package com.hrishi.hackerrank.strings;

public class LoveLetterMystery {

	public static void main(String[] args) {
		
		System.out.println(theLoveLetterMystery("abc"));
		
	}
	
	static int theLoveLetterMystery(String s) {
		int count = 0;
		
		for(int i=0,j=(s.length()-1); i<=j; i++,j--) {
			char jChar = s.charAt(j);
			char iChar = s.charAt(i);
			while(iChar != jChar) {
				count++;
				if(iChar < jChar) {
					int c = jChar;
					char mod = (char)--c;
					jChar = mod;
				} else {
					int c = iChar;
					char mod = (char)--c;
					iChar = mod;
				}
				
			}
		}
		
		return count;
	}
}
