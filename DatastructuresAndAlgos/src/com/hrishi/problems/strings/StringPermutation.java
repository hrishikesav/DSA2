package com.hrishi.problems.strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StringPermutation {
	
	public static void main(String[] args) {
		
		String string = "aabc";
		char[] resultString = new char[string.length()];
		
		Map<Character,Integer> map = new TreeMap<>();
		
		for(char c : string.toCharArray()) {
			map.compute(c,(k,v) -> (v == null) ? 1 : v+1);
		}
		
		char[] str = new char[map.size()];
		int[] count = new int[map.size()];
		
		int i = 0;
		for(Entry<Character,Integer> entry : map.entrySet()) {
			str[i] = entry.getKey();
			count[i] = entry.getValue();
			++i;
		}
		
		formString(str, count, resultString,0);
		
	}
	
	static void formString(char[] str, int[] count, char[] result,int level) {
		
		if(level == result.length) {
			for(char c : result) {
				System.out.print(c);
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<str.length; i++) {
			if(count[i] == 0) {
				continue;
			}
			
			char cr = str[i];
			result[level] = cr;
			count[i]--;
			level++;
			formString(str,count,result,level);
			count[i]++;
			level--;
		}
		
	}

}
