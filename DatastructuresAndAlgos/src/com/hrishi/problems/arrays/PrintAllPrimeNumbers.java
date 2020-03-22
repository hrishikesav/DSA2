package com.hrishi.problems.arrays;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer argument and returns all the primes between1
		 * and that integer. For example, if the input is18, you should return (2, 3,5,7,11,13,17).
		 */
		int num = 24;
		boolean notPrime = false;
		
		for(int i=1; i<num; i++) {
			int j = 2;
			notPrime = false;
			if(i<=2) {
				System.out.print(i + " ");
				continue;
			}
			while(j<= (int) Math.sqrt(i)) {
				if((i%j) == 0) {
					notPrime = true;
					break;
				}
				j++;
			}
			if(!notPrime) {
				System.out.print(i + " ");
			}
		}
	}

}
