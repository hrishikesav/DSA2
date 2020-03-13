package com.hrishi.algorithms.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = {5,3,12,56,2,9,8};
		
		
		for(int j=0; j<data.length; j++) {
			for(int i=1; i<data.length; i++) {
				if(data[i-1] > data[i]) {
					int temp = data[i-1];
					data[i-1] = data[i];
					data[i] = temp;
				}
			}
		}
		
		
		for(Integer i: data) {
			System.out.println(i);
		}
	}

}
