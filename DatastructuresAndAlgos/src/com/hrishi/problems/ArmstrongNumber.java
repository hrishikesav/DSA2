package com.hrishi.problems;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 153;
		System.out.println("Is " + n + " an Armstrong number: " + checkArmstrong(n));
	}
	
	static boolean checkArmstrong(int num) {
		int sum = 0;
		int orig = num;
		while(num > 0) {
			int n = num % 10;
			sum += Math.pow(n, 3);
			num = num/10;
		}
		if(sum == orig) {
			return true;
		} else {
			return false;
		}
		
	}

}
