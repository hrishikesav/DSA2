package com.hrishi.problems.bitmanipulation;

public class CountSetBits {

	public static void main(String[] args) {
		int num = 7;
		System.out.println("Number " + num + " in binary is " +
				Integer.toBinaryString(num) + ". Set bits - " + countSetBits(num));
	}
	
	static int countSetBits(int num) {
		int count = 0;
		while(num > 0) {
			count += num&1;
			num >>= 1;
		}
		return count;
	}

}
