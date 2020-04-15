package com.hrishi.hackerrank.arrays;

public class HourglassSum {

	public static void main(String[] args) {

		int[][] arr = new int[6][6];
		
		arr[0][0] = -9; arr[0][1] = -9; arr[0][2] = -9; arr[0][3] = 1; arr[0][4] = 1; arr[0][5] = 1;
		arr[1][0] = 0; arr[1][1] = -9; arr[1][2] = 0; arr[1][3] = 4; arr[1][4] = 3; arr[1][5] = 2;
		arr[2][0] = -9; arr[2][1] = -9; arr[2][2] = -9; arr[2][3] = 1; arr[2][4] = 2; arr[2][5] = 3;
		arr[3][0] = 0; arr[3][1] = 0; arr[3][2] = 8; arr[3][3] = 6; arr[3][4] = 6; arr[3][5] = 0;
		arr[4][0] = 0; arr[4][1] = 0; arr[4][2] = 0; arr[4][3] = -2; arr[4][4] = 0; arr[4][5] = 0;
		arr[5][0] = 0; arr[5][1] = 0; arr[5][2] = 1; arr[5][3] = -2; arr[5][4] = 4; arr[5][5] = 0;
		
		System.out.println(largestHourglassSum(arr));
	}

	static int largestHourglassSum(int[][] arr) {
		int sum = -99999;
		int size = 6;
		
		int r,c;
		r = c = 0;
		
		while(r < size-2) {
			while(c < size-2) {
				int val = 0;
				for(int i=c; i<= c+2; i++) {
					val += arr[r][i];
				}
				val += arr[r+1][c+1];
				int j = r + 2;
				for(int i=c; i<= c+2; i++) {
					val += arr[j][i];
				}
				c++;
				if(val > sum) {
					sum = val;
				}
			}
			c=0;
			r++;
		}
		
		return sum;
	}
}
