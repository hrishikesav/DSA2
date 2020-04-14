package com.hrishi.maths;

public class GCD {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 3;
		
		System.out.println(findGCD(num1, num2));
	}
	
	public static int findGCD(int num1, int num2) {
		int gcd = 1;
		
		if(num1 == 0) {
			gcd = num2;
		} else if(num2 == 0) {
			gcd = num1;
		} else {
			gcd = findGCD(num2, num1%num2);
		}
		
		return gcd;
	}

}
