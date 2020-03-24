package com.hrishi.functional;

import java.util.function.Function;

public class HelloWorldFuctionalInterface {

	public static void main(String[] args) {

		// Old way
		int num = 0;
		System.out.println(incrementByOne(num));
		
		// New way
		Function<Integer, Integer> incrementByOneFunction = number -> ++number;
		System.out.println(incrementByOneFunction.apply(num));
	}
	
	static int incrementByOne(int num) {
		return ++num;
	}

}
