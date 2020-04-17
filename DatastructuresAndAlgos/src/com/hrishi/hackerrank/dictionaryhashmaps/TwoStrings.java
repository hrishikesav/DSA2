package com.hrishi.hackerrank.dictionaryhashmaps;

import java.util.Set;
import java.util.HashSet;

public class TwoStrings {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "world";
		System.out.println(twoStrings(s1,s2));
	}
	
	static String twoStrings(String s1, String s2) {
		String ret = "NO";
		
		Set<Character> c1 = new HashSet<>();
		Set<Character> c2 = new HashSet<>();
		
		for(int i=0; i<s1.length(); i++) {
			c1.add(s1.charAt(i));
		}
		
		for(int i=0; i<s2.length(); i++) {
			c2.add(s2.charAt(i));
		}

		c1.retainAll(c2);
		
		if(!c1.isEmpty()) {
			ret = "YES";
		}
		return ret;
	}

}
