package com.hrishi.problems;

/*
 * This gets all the possible combinations to get to the amount(num).
 * 
 * To get the minimum possible coins needed to get to the amount(num) see below class:
 * {CoinChangeMinimumCoins}
 */
public class CoinChangeAllPossibleCombinations {

	public static void main(String[] args) {
		
		int[] coins = {1,2,3};
		int num = 5;
		getCoinCount(coins, num);
	}
	
	static void getCoinCount(int[] coins, int num) {
		int[][] matrix = new int[coins.length+1][num+1];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0;j<matrix[i].length; j++) {
				if(j==0) {
					matrix[i][j] = 1;
					continue;
				}
				
				if(i == 0 && j != 0) {
					matrix[i][j] = 0;
					continue;
				}
				
				if(j < coins[i-1]) {
					matrix[i][j] = matrix[i-1][j];
				} else {
					matrix[i][j] = matrix[i][j-coins[i-1]] + matrix[i-1][j];
				}
			}
		}
		
		printMatrix(matrix);
	}
	
	static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0;j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Maximum possible combinations = " + matrix[matrix.length-1][matrix[0].length-1]);
	}

}
