package com.hrishi.problems.strings;

public class RabinKarpPatternSearch {

	/*
	 * n = size of text
	 * m = size of pattern
	 * O(n-m+1)
	 */
	public static void main(String[] args) {
		
		String text = "ccaccaaedba";
		
		String pattern = "dba";
		
		long hash = getHashCodeForPattern(pattern);
		int index = getPatternInText(text, pattern.length(), hash);
		
		String message = (index == -1) ? "Pattern not found. " : "Pattern found at " + index;
		System.out.println(message);
	}
	
	private static int getPatternInText(String text, int len, long hash) {
		int index = -1;
		for(int i=0 ; i< (text.length()-len+1); i++) {
			String subText = text.substring(i,(len+i));
			long subTextHash = getHashCodeForPattern(subText);
			if(hash == subTextHash) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	private static long getHashCodeForPattern(String pattern) {
		long hash = 0;
		for(int i = 0; i<pattern.length(); i++) {
			long ascii = (long)pattern.charAt(i);
			long power = Math.round(Math.pow(10, i));
			hash += (ascii * power);
		}
		return hash;
	}
}
