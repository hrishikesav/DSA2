package com.hrishi.algorithms.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] data = {5,3,12,56,2,9,8};
		int find = 56;
		
		for(int i=0; i<data.length; i++) {
			if(data[i] == find) {
				System.out.println("Found " + find + " at index " + i + ".");
			}
		}
	}
}
