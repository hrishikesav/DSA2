package com.hrishi.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HelloWorldFuctionalInterface {

	public static void main(String[] args) {

		// Old way
		int num = 0;
		System.out.println(incrementByOne(num));
		
		// New way
		Function<Integer, Integer> incrementByOneFunction = number -> ++number;
		System.out.println(incrementByOneFunction.apply(num));
		
		Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
		
		Function<Integer, Integer> addThenMultiplyFunction = incrementByOneFunction.andThen(multiplyBy10Function);
		
		System.out.println(addThenMultiplyFunction.apply(num));
		
		BiFunction<Integer, Integer, Integer> addByOneAndThenMultiply = (number, multiplyBy) -> ++number * multiplyBy;
		System.out.println(addByOneAndThenMultiply.apply(num, 5));
		
	}
	
	static int incrementByOne(int num) {
		return ++num;
	}

}
