package com.hrishi.hackerrank.arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		int n = 4000;
		int[][] queries = new int[3][3];
		
		queries[0][0] = 2250; queries[0][1] = 2540; queries[0][2] = 180674;
		queries[1][0] = 2459; queries[1][1] = 3892; queries[1][2] = 434122;
		queries[2][0] = 2321; queries[2][1] = 3289; queries[2][2] = 363503;
		
		System.out.println(arrayManipulation(n, queries));
	}
	
	static long arrayManipulation(int n, int[][] queries) {
		
		long[] arr = new long[n+2];
		
		for(int i=0; i<queries.length;i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			int val = queries[i][2];
			arr[start] += val;
			arr[end+1] -= val;
		}
		return getMaxVal(arr);
	}
	
	static long getMaxVal(long[] arr) {
		long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
		}
		return max;
	}

}
