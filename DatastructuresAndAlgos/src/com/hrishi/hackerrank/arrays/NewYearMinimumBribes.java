package com.hrishi.hackerrank.arrays;

public class NewYearMinimumBribes {

	public static void main(String[] args) {
		
		int[] q = {2,5,1,3,4};
		minBribes(q);
	}

	static void minBribes(int[] q) {
		int minBribes = 0;
		
		for(int i=(q.length-1); i>=0;i--) {
			if(q[i] != (i+1)) {
				if(q[i-1] == (i+1)) {
					minBribes++;
					swap(q, i, i-1);
				} else if(q[i-2] == (i+1)) {
					minBribes += 2;
					swap(q, i-2, i-1);
					swap(q, i-1, i);
				} else {
					minBribes = -1;
					break;
				}
			}
			
		}
		
		System.out.println((minBribes >= 0) ? minBribes : "Too chaotic");
	}
	
	static void swap(int[] q, int i, int c) {
		int temp = q[i];
		q[i] = q[c];
		q[c] = temp;
	}
}
