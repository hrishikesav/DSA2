package com.hrishi.hackerrank.warmup;

import java.util.Set;
import java.util.HashSet;

public class SocksCount {

	public static void main(String[] args) {
		
		int[] arr = {10,20,20,10,10,30,50,10,20};
		System.out.println(sockMerchant(arr.length, arr));
	}
	
	static int sockMerchant(int count, int[] arr) {
			
		Set<Integer> set = new HashSet<>();
		int match = 0;
		
		for(int num : arr) {
			if(set.contains(num)) {
				++match;
				set.remove(num);
			} else {
				set.add(num);
			}
		}
		
		return match;
	}

}
