package com.hrishi.problems.arrays;

public class DutchNationalFlagProblem {

	public static void main(String[] args) {

		int[] arr = {1,0,1,2,1,0};
		
		int pivotIndex = 2;
		int pivotValue = arr[pivotIndex];
		
		int holdLow = 0;
		int i = 0;
		
		int holdHigh = arr.length - 1;
		int j = arr.length - 1;
		
		while(i < arr.length) {
			if(arr[i] < pivotValue) {
				int temp = arr[holdLow];
				arr[holdLow] = arr[i];
				arr[i] = temp;
				holdLow++;
			}
			i++;
			
			if(arr[j] > pivotValue) {
				int temp = arr[holdHigh];
				arr[holdHigh] = arr[j];
				arr[j] = temp;
				holdHigh--;
			}
			j--;
		}
		
		for(int u=0; u<arr.length; u++) {
			System.out.print(arr[u] + " ");
		}
	}

}
