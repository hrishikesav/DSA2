package com.hrishi.problems.strings;

public class StringCompression {

	public static void main(String[] args) {
		
		String string = "aaabccc";
		System.out.println(compressString(string));
		
	}
	
	static String compressString(String string) {
		
		StringBuilder strBuilder = new StringBuilder();
		char lastChar = string.charAt(0);
		int start = 0;
		int count = 1;
		for(int i=1; i<string.length(); i++) {
			if(string.charAt(i) == lastChar) {
				count++;
				continue;
			} else {
				strBuilder.append(lastChar).append(String.valueOf(count));
				lastChar = string.charAt(i);
				count = 1;
			}
		}
		strBuilder.append(lastChar).append(String.valueOf(count));
		return strBuilder.toString();
	}

}
