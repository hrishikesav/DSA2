package com.hrishi.problems.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;

public class FindNumbersWithMostOccurrencesInArray {

	/*
	 * k number of most occurrence to be printed in array arr.
	 */
	public static void main(String[] args) {
		
//		int[] arr = {3,1,4,4,5,2,6,1};
//		int k = 2; 
		
		int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
		int k = 4; 
		
		findMostOccurrences(k, arr);
	}
	
	static void findMostOccurrences(int k, int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		
		PriorityQueue<Entry> pQ = new PriorityQueue<>();
		
		for(int i : arr) {
			if(map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		
		for(Integer i : map.keySet()) {
			Entry entry = new FindNumbersWithMostOccurrencesInArray().new Entry(i, map.get(i));
			pQ.add(entry);
		}
		
		for(int i=0; i<k; i++) {
			Entry entry = pQ.poll();
			System.out.print(entry.number + " ");
		}
		
	}
	
	class Entry implements Comparable<Entry> {
		int number;
		int count;
		
		Entry(int number, int count) {
			this.number = number;
			this.count = count;
		}
		
		public int compareTo(Entry obj) {
			if(obj.count != this.count) {
				return obj.count - this.count;
			} else {
				return obj.number - this.number;
			}
		}
	}

}
