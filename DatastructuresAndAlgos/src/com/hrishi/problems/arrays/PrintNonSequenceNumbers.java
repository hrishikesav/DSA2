package com.hrishi.problems.arrays;

public class PrintNonSequenceNumbers {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,5,6,7,9};
		
		printNonSequenceNumbers(arr);
	}
	
	static void printNonSequenceNumbers(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				System.out.print(arr[i] + " ");
			} else {
				if(arr[i] - arr[i-1] > 1) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

}
