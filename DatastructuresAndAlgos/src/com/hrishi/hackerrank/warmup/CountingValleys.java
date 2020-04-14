package com.hrishi.hackerrank.warmup;

import java.util.Set;
import java.util.HashSet;

public class CountingValleys {

	public static void main(String[] args) {
		
		String s = "DDUUDDUDUUUD";
		System.out.println(countingValleys(s.length(), s));
	}

	static int countingValleys(int n, String s) {
		int count = 0;
		int level = 0;
		
		for(Character c : s.toCharArray()) {
			if(c.equals('U')) {
				if(level == -1) {
					count++;
				}
				++level;
			} else {
				--level;
			}
		}
		return count;
	}
	
	/*static int countingValleys(int n, String s) {
		int count = 0;
		int level = 0;
		Set<Integer> levels = new HashSet<>();
		boolean seq = false;
		
		for(Character c : s.toCharArray()) {
			if(c.equals('U')) {
				++level;
				if(seq) {
					if(!levels.contains(level)) {
						++count;
						levels.add(level);
					}
					seq = false;
				}
			} else {
				seq = true;
				--level;
			}
		}
		return count;
	}*/
}
