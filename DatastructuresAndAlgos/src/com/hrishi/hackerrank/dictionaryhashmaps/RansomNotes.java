package com.hrishi.hackerrank.dictionaryhashmaps;

import java.util.Map;
import java.util.HashMap;

public class RansomNotes {

	public static void main(String[] args) {
		
		String magazine = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";
		String note = "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";
		
		checkMagazine(magazine.split(" "), note.split(" "));
	}

	static void checkMagazine(String[] magazine, String[] note) {
		
		String str = "";
		Map<String,Integer> list = new HashMap<>();
		for(String s : magazine) {
			if(list.containsKey(s)) {
				int times = list.get(s);
				list.put(s,times+1);
			} else {
				list.put(s,1);
			}
		}
		
		for(String s: note) {
			if(list.containsKey(s)) {
				int times = list.get(s);
				times--;
				if(times == 0) {
					list.remove(s);
				} else {
					list.put(s, times);
				}
				str = "Yes";
			} else {
				str = "No";
				break;
			}
		}
		System.out.println(str);
	}
}
