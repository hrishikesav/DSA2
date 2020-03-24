package com.hrishi.problems.arrays;

public class FirstDuplicateInArrayWithOnlyNumbersWithinRange {

	public static void main(String[] args) {
		
		/*
		 * Array contains only numbers from 1 to array.length.
		 * Find first duplicate and return that number.
		 */
		
		int[] arr = {2,1,3,5,3,2};
		
		for(int i=0; i<arr.length; i++) {
			int num = Math.abs(arr[i]);
			int indexToChangeSign = num-1;
			
			if(arr[indexToChangeSign] < 0) {
				System.out.println("First duplicate number is : " + Math.abs(arr[indexToChangeSign]));
				break;
			} else {
				int numChangeSign = Math.abs(arr[indexToChangeSign]);
				arr[indexToChangeSign] = -numChangeSign;
			}
		}
	}

}
