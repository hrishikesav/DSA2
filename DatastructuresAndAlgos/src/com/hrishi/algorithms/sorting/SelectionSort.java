package com.hrishi.algorithms.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] data = {5,3,12,56,2,9,8};
		
		
		for(int j=0; j<data.length; j++) {
			int selection = data[j];
			int lowestIndex = -1;
			for(int i=j+1; i<data.length; i++) {
				if(selection > data[i]) {
					if(lowestIndex != -1) {
						if(data[lowestIndex] > data[i]) {
							lowestIndex = i;
						}
					} else {
						lowestIndex = i;
					}
				}
			}
			if(lowestIndex != -1) {
				data[j] = data[lowestIndex];
				data[lowestIndex] = selection;
			}
		}
		
		for(Integer i: data) {
			System.out.println(i);
		}
	}

}
