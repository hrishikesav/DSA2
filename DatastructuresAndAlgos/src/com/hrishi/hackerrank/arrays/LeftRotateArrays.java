package com.hrishi.hackerrank.arrays;

import com.hrishi.maths.GCD;

public class LeftRotateArrays {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int d = 3;
		arr = leftRotateArray(arr, d);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	static int[] leftRotateArray(int[] a, int d) {
		int n = a.length;
		
		int gcd = GCD.findGCD(a.length, d);
		int i, j, k, temp;
		
		for(i=0; i<gcd; i++) {
			temp = a[i]; 
            j = i; 
            while (true) { 
                k = j + d; 
                if (k >= n) 
                    k = k - n; 
                if (k == i) 
                    break; 
                a[j] = a[k]; 
                j = k; 
            } 
            a[j] = temp;
		}
		
		return a;
	}
}
