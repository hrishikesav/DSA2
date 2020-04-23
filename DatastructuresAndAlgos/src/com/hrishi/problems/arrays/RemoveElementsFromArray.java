package com.hrishi.problems.arrays;

public class RemoveElementsFromArray {

	public static void main(String[] args) {
		
		int[] arr = {5,3,12,56,12,2,9,12,8,32};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		removeElementFromArray(arr, 12);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void removeElementFromArray(int[] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				copyArrayElements(arr, i);
			}
		}
	}
	
	static void copyArrayElements(int[] arr, int startIndex) {
		for(int i=startIndex; i<arr.length; i++) {
			if(i<(arr.length-1)) {
				arr[i] = arr[i+1];
			}
			if(i == (arr.length - 1)) {
				arr[i] = 0;
			}
		}
	}

}
