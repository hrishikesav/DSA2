package com.hrishi.problems.strings;

public class PalindromicString {

	public static void main(String[] args) {
		
		String str = "123321";
		
		System.out.println(str + " is " + (isPalindromic(str) ? "palindrome." : "not palindrome."));
	}
	
	static boolean isPalindromic(String string) {
		int len = string.length();
		for(int i=0, j=len-1; i<len; i++,j--) {
			if(string.charAt(i) != string.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
