package com.hrishi.hackerrank.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MakeAnagram {

	public static void main(String[] args) {
		
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println(makeAnagram(a,b));
	}

	static int makeAnagram(String a, String b) {
		int count = 0;
		
		Map<Character,Integer> aMap = new HashMap<>();
		Map<Character,Integer> bMap = new HashMap<>();
		
		for(char aChar : a.toCharArray()) {
			if(aMap.containsKey(aChar)) {
				aMap.put(aChar, aMap.get(aChar) + 1);
			} else {
				aMap.put(aChar, 1);
			}
		}
		
		for(char bChar : b.toCharArray()) {
			if(bMap.containsKey(bChar)) {
				bMap.put(bChar, bMap.get(bChar) + 1);
			} else {
				bMap.put(bChar, 1);
			}
		}
		
		Iterator<Character> iterator1 = aMap.keySet().iterator();
		Iterator<Character> iterator2 = bMap.keySet().iterator();
		
		while(iterator1.hasNext()) {
			char c = iterator1.next();
			if(bMap.containsKey(c)) {
				int aCount = aMap.get(c);
				int bCount = bMap.get(c);
				int diff = aCount - bCount;
				if(diff != 0) {
					count += Math.abs(diff);
				}
			} else {
				int aCount = aMap.get(c);
				count += aCount;
			}
		}
		
		while(iterator2.hasNext()) {
			char c = iterator2.next();
			if(!aMap.containsKey(c)) {
				int bCount = bMap.get(c);
				count += bCount;
			} 
		}
		
		return count;
	}
}
