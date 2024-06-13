package com.hrishi.problems;

public class Fibonacci {

	static int n1 = 0, n2 = 1;
	static int i = 0;
	
	public static void main(String[] args) {
		
		int count = 10;
		System.out.print("0 1 ");
		fibo(count);
		System.out.println();
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
	
	static void fiboRecursion(int num) {
		if(num > 0) {
			if(i == 0) {
				System.out.print(n1 + " ");
				i++;
			} else if (i == 1) {
				System.out.print(n2 + " ");
				i++;
			} else {
				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}
			fiboRecursion(num-1);
		}
	}

}
