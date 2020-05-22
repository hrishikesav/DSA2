package com.hrishi.algorithms.backtracking;

public class NQueensProblem {

	public static void main(String[] args) {
		
		int[][] array = new int[4][4];
		
		placeNQueens(array, 4, 0);
	}
	
	static boolean checkIfAttackingPosition(int newX, int newY, int[][] array) {
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<array.length; col++) {
				if(array[row][col] == 1) {
					if(newX == row 
							|| newY == col 
							|| (newX-newY == row-col)
							|| (newX+newY == row+col)) {
						return true;
					} 
				}
			}
		}
		return false;
		
	}
	
	static boolean placeNQueens(int[][] array, int N, int count) {
		if(N == count) {
			printArray(array);
			return true;
		}
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<array.length; col++) {
				if(array[row][col] == 0 && !checkIfAttackingPosition(row, col, array)) {
					array[row][col] = 1;
					if(placeNQueens(array, N, count+1)) {
						return true;
					}
					array[row][col] = 0;
					
				}
			}
		}
		return false;
	}
	
	static void printArray(int[][] array) {
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<array.length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

}
