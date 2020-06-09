package com.hrishi.problems;

public class KnapsackProblem {

	public static void main(String[] args) {

		int[] val = { 60, 50, 70, 30 };
		int[] wets = { 5, 3, 4, 2 };

		knapsack(val, wets, 5);
	}

	static void knapsack(int[] val, int[] wets, int weight) {
		int[][] matrix = new int[wets.length][weight + 1];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == 0 || j == 0) {
					if (j < wets[i]) {
						matrix[i][j] = 0;
					} else {
						matrix[i][j] = val[i];
					}

					continue;
				}
				if (j < wets[i]) {
					matrix[i][j] = matrix[i - 1][j];
				} else {
					int val1 = matrix[i - 1][j];
					int val2 = val[i] + matrix[i - 1][j - wets[i]];
					matrix[i][j] = Integer.max(val1, val2);
				}
			}
		}

		printMatrix(matrix);

	}

	static void printMatrix(int[][] matrix) {
		int num = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] > num) {
					num = matrix[i][j];
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Maximum possible value for the given weight is: "+ num);
	}

}
