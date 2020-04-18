package com.hrishi.hackerrank.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		countSwaps(arr);
	}

	static void countSwaps(int[] a) {
		int swaps = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swaps++;
				}
			}
		}
		System.out.println("Array is sorted in " + swaps +" swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length-1]);
	}
}
