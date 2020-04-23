package com.hrishi.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveElementsFromArray {

	public static void main(String[] args) {
		
		int[] arr = {5,3,12,56,12,2,9,12,8,32};
		
		List<Integer> asList = new ArrayList<>();
		asList.add(90);
		asList.add(190);
		asList.add(290);
		asList.add(390);
		
		asList.stream().forEach(System.out::println);
		
		
		/*
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		removeElementFromArray(arr, 12);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
	}
	
	static void removeElementUsingStreams(int[] arr, int element) {
//		arr = IntStream.range(0, arr.length).filter(arr[i] -> arr[i] != element).map(i -> arr[i]).toArray();
	}
	
	static void removeElementFromArray(int[] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				copyArrayElements(arr, i);
			}
		}
	}
	
	static void copyArrayElements(int[] arr, int startIndex) {
		for(int i=startIndex; i<arr.length; i++) {
			if(i<(arr.length-1)) {
				arr[i] = arr[i+1];
			}
			if(i == (arr.length - 1)) {
				arr[i] = 0;
			}
		}
	}

}
