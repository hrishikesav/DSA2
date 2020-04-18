package com.hrishi.hackerrank.dictionaryhashmaps;

import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CountTriplets {

	public static void main(String[] args) {
		
		List<Long> arr = new ArrayList<>();
		arr.add(Long.parseLong("1"));
		arr.add(Long.parseLong("5"));
		arr.add(Long.parseLong("5"));
		arr.add(Long.parseLong("25"));
		arr.add(Long.parseLong("125"));
		
		long r = 5;
		
		System.out.println(countTriplets(arr, r));
	}
	
	static long countTriplets(List<Long> arr, long r) {
		Map<Long,Long> leftMap = new HashMap<>();
		Map<Long,Long> rightMap = new HashMap<>();
		
		for(int i=0; i<arr.size(); i++) {
			rightMap.put(arr.get(i),rightMap.get(arr.get(i))!=null?rightMap.get(arr.get(i))+1:1);
		}
		int count = 0;
		for(int i=0; i<arr.size(); i++) {
			long num = arr.get(i);
			long countLeft = 0;
			long countRight = 0;
			
			rightMap.put(num,rightMap.get(num)>0?rightMap.get(num)-1:0);
			
			if(leftMap.get(num/r)!=null && (num%r == 0)) {
				countLeft = leftMap.get(num/r);
			}
			
			if(rightMap.get(num*r)!=null) {
				countRight = rightMap.get(num*r);
			}
			
			count += countLeft * countRight;
			
			leftMap.put(num,leftMap.get(num)!=null?leftMap.get(num)+1:1);
		}
		return count;
	}
	
	/*static long countTriplets(List<Long> arr, long r) {
		long count = 0;
		
		List<LinkedList<Integer>> seqs = new LinkedList<>();
		
		for(int i=0; i<arr.size(); i++) {
			long num = arr.get(i);
			
			LinkedList<Integer> backup = null;
			boolean useBackup = false;
			for(int j=0; j<seqs.size(); j++) {
				LinkedList<Integer> list = seqs.get(j);
				int size = list.size();
				if( size >= 3) {
					continue;
				} else {
					int ind = list.get(size-1);
					long prevNum = arr.get(ind);
					if(prevNum < num && (prevNum*r == num)) {
						if(size < 2) {
							backup = (LinkedList<Integer>) list.clone();
							useBackup = true;
						}
						list.add(i);
					}
				}
			}
			if(useBackup) {
				useBackup = false;
				seqs.add(backup);
			}
			
			if(num == 1) {
				LinkedList<Integer> temp = new LinkedList<>();
				temp.add(i);
				seqs.add(temp);
			} else if(num%r == 0) {
				LinkedList<Integer> temp = new LinkedList<>();
				temp.add(i);
				seqs.add(temp);
			} else {
				continue;
			}
			
		}
		
		for(int j=0; j<seqs.size(); j++) {
			LinkedList<Integer> list = seqs.get(j);
			int size = list.size();
			if( size >= 3) {
				count++;
			}
		}
		count = seqs.size();
		return count;
	}*/

}
