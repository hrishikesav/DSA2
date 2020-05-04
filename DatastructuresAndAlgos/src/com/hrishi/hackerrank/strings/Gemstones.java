package com.hrishi.hackerrank.strings;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Gemstones {

	public static void main(String[] args) {
		
//		String[] arr = {"abc","abc","bc"};
		String[] arr = {"abc","abc","bc"};
//		String[] arr = {"abcdde","baccd","eeabg"};
		System.out.println(countGemstones(arr));
	}
	
	static int countGemstones(String[] arr) {
		Set<Character> set = new HashSet<>();
		Set<Character> removed = new HashSet<>();
		
		String first = arr[0];
		for(int i=1; i<arr.length; i++) {
			for(char c : first.toCharArray()) {
				String str = arr[i];
				if(str.contains(String.valueOf(c))) {
					if(!removed.contains(c)) {
						set.add(c);
					}
				} else {
					set.remove(c);
					removed.add(c);
				}
			}
		}
		
		return set.size();
	}

}
