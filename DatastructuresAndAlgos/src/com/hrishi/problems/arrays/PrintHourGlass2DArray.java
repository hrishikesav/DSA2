package com.hrishi.problems.arrays;

public class PrintHourGlass2DArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==0 || i==2) {
					arr[i][j] = 1;
				}
				if(i==1 && j==1) {
					arr[i][j] = 1;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
