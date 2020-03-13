package com.hrishi.algorithms.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] data = {5,3,12,56,2,9,8};
		int find = 12;
		boolean found = false;
		int low = 0;
		int high = data.length;
		int mid = 0;
		Arrays.sort(data);
		while( !found ) {
			mid = low + ((high-low)/2);
			if(data[mid] == find) {
				found = true;
				System.out.println("Found " + find + " at index " + mid + ".");
				break;
			} else if(data[mid] > find) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}
}
