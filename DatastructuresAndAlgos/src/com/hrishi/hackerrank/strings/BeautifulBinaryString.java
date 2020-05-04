package com.hrishi.hackerrank.strings;

public class BeautifulBinaryString {
	
	/*
	 * Replace 010 occurrences in the input string to any other binary characters.
	 * Find the minimum count with which this can be done.
	 */

	public static void main(String[] args) {
		
		String str = "0100101010";
		System.out.println(beautifulBinaryString(str));
	}
	
	static int beautifulBinaryString(String s) {
		int count = 0;
		String toFind = "010";
		
		while(true) {
			int i= s.indexOf(toFind);
			if(i == 0) {
				s = s.substring(0,2) + "1" + s.substring(3, s.length());
				count++;
			} else if(i == 1) {
				s = s.substring(0,1) + "1" + s.substring(2, s.length());
				count++;
			} else if(i > 1) {
				s = s.substring(i,i+2) + "1" + s.substring(i+3, s.length());
				count++;
			} else {
				break;
			}
		}
		
		return count;
	}

}
