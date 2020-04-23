package com.hrishi.problems.arrays;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {5,3,12,56,2,9,8,32};
		System.out.println(getSecHighestElement(arr));
	}
	
	static int getSecHighestElement(int[] arr) {
		int highest = 0;
		int secHighest = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < highest && arr[i] > secHighest) {
				secHighest = arr[i];
			}
			if(arr[i] > highest) {
				secHighest = highest;
				highest = arr[i];
			}
		}
		return secHighest;
	}

}
