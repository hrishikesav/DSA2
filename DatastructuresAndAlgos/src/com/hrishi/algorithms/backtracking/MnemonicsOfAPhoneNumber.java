package com.hrishi.algorithms.backtracking;

import java.util.Map;
import java.util.HashMap;

public class MnemonicsOfAPhoneNumber {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		populateMap(map);
		
		String number = "89";
		
		char[] result = new char[number.length()];
		
		mnemonics(result, 0, 0, map, number);
	}
	
	static void mnemonics(char[] result, int numberLevel,int stringLevel,Map<Integer,String> map, String number) {
		if(numberLevel >= result.length) {
			printArray(result);
			return;
		}
		
	
		String numStr = number.charAt(numberLevel) + "";
		int num = Integer.parseInt(numStr);
		String letters = map.get(num);
		
		for(int i=0; i<letters.length(); i++) {
			if(stringLevel >= letters.length()) {
				stringLevel = 0;
			}
			char ch = letters.charAt(stringLevel);
			result[numberLevel] = ch;
			
			numberLevel++;
			mnemonics(result, numberLevel, stringLevel, map, number);
			
			stringLevel++;
			numberLevel--;
		}
		
		
	}
	
	static void printArray(char[] result) {
		for(char c : result) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	
	static void populateMap(Map<Integer,String> map) {
		map.put(2,"ABC");
		map.put(3,"DEF");
		map.put(4,"GHI");
		map.put(5,"JKL");
		map.put(6,"MNO");
		map.put(7,"PQRS");
		map.put(8,"TUV");
		map.put(9,"WXYZ");
	}

}
