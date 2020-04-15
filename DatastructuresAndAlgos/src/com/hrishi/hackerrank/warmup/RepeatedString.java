package com.hrishi.hackerrank.warmup;

public class RepeatedString {

	public static void main(String[] args) {
		
		String s = "a";
		long n = 1000000000001l;
		System.out.println(repeatedString(s,n));
	}

	static long repeatedString(String s, long n) {
		long count = 0;
		
		for(char c: s.toCharArray()) {
			if(c == 'a') {
				count++;
			}
		}
		
		long times = n / s.length();
		long rem = n % s.length();
		
		count *= times;
		
		for(int i=0; i < rem; i++) {
			if(s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}
