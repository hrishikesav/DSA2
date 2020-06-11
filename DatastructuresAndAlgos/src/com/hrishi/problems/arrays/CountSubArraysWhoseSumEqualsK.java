package com.hrishi.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysWhoseSumEqualsK {
	
	static int count = 0;

	public static void main(String[] args) {
		
		int[] arr = {3,4,7,2,-3,1,4,2};
	    int k = 7;
	    
	    printSubArraySumEqualsK(arr,k);
	    printSubArraySumEqualsKEasier(arr,k);
	    
	}
	
	static void printSubArraySumEqualsK(int[] arr, int k) {
	    int[] sumArr = new int[arr.length];
	    Map<Integer,Integer> mapCount = new HashMap<>();
	    
	    for(int i=0; i<arr.length; i++) {
	      if(i==0) {
	        sumArr[i] = arr[i];
	      } else {
	        sumArr[i] = sumArr[i-1] + arr[i];
	      }
	      
	      mapCount.put(sumArr[i],mapCount.getOrDefault(sumArr[i],0)+1);
	      
	      if(arr[i] == k) {
	        count++;
	      }
	      
	      if(mapCount.containsKey(sumArr[i] - k)) {
	        count++;
	      }
	      
	    }
	    
	    System.out.println("\n" + count);
	    }
	
	static void printSubArraySumEqualsKEasier(int[] arr, int k) {
	    int count=0;
	    Map<Integer,Integer> mapCount = new HashMap<>();
	    mapCount.put(0,1);
	    
	    int sum = 0;
	    for(int i=0; i<arr.length; i++) {
	      sum += arr[i];
	      
	      if(mapCount.containsKey(sum-k)) {
	        count += mapCount.get(sum-k);
	      }
	      
	      mapCount.put(sum, mapCount.getOrDefault(sum,0)+1);
	         
	    }
	    
	    System.out.println(count);
	  }

}
