package com.hrishi.hackerrank.arrays;

import java.util.Map;
import java.util.HashMap;

public class MinimumSwapSort {

	public static void main(String[] args) {
		
		int[] arr = {1,4,3,2};
		System.out.println(minSwapCount(arr));
	}

	static int minSwapCount(int[] arr) {
		int swaps = 0;
		
		boolean[] isVisited = new boolean[arr.length + 1];
		Map<Integer,Integer> nodeMap = new HashMap<>();
		
		for(int i=1; i<isVisited.length; i++) {
			nodeMap.put(i, arr[i-1]);
		}
		
		for(int k=1; k<= nodeMap.size(); k++) {
			if(!isVisited[k]) {
				isVisited[k] = true;
				
				if(k == nodeMap.get(k)) {
					continue;
				} else {
					int c = nodeMap.get(k);
					while(!isVisited[c]) {
						isVisited[c] = true;
						
						c = nodeMap.get(c);
						swaps++;
					}
				}
			}
		}
		
		return swaps;
	}
}
