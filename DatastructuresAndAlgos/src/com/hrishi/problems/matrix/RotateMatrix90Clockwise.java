package com.hrishi.problems.matrix;

public class RotateMatrix90Clockwise {

	public static void main(String[] args) {

		int[][] array = new int[3][3];
		
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[1][0] = 6;
		array[1][1] = 7;
		array[1][2] = 8;
		array[2][0] = 11;
		array[2][1] = 12;
		array[2][2] = 13;
		
		rotateClockwise(array);
	}
	
	static void rotateClockwise(int[][] array) {
		int len = array.length;
		for(int col=0; col < len; col++) {
			for(int row=len-1; row >=0; row--) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

}
