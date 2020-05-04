package com.hrishi.problems;

public class Fibonacci {

	static int n1 = 0, n2 = 1;
	
	public static void main(String[] args) {
		
		int count = 10;
		System.out.print("0 1 ");
		fibo(count);
		System.out.println();
		System.out.print("0 1 ");
		count = 10;
		fiboRecursion(count);
	}
	
	static void fibo(int count) {
		int n1 = 0;
		int n2 = 1;
		for(int i=2; i<count; i++) {
			int sum = n1+n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
		}
	}
	
	static void fiboRecursion(int count) {
		if(count > 2) {
			int sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
			--count;
			fiboRecursion(count);
		}
	}

}
