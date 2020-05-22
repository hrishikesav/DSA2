package com.hrishi.problems.arrays;

public class TotalOccurrencesOfANumberInSortedArray {
	
	/*
	 * O(log(n))
	 */

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,3,3,3,4,5,5};
		int find = 1;
		System.out.println(findIndex(arr,find));
	}
	
	static int findIndex(int[] arr, int find) {
		int left = 0;
		int right = arr.length - 1;
		int startIndex = binarySearch(arr,left,right,find,BinarySearchType.FIRST);
		int endIndex = binarySearch(arr,left,right,find,BinarySearchType.LAST);
		
		return endIndex - startIndex + 1;
	}
	
	static int binarySearch(int[] arr, int left, int right, int find, BinarySearchType searchType) {
		if(left <= right) {
			int mid = left + (right-left)/2;
			if(arr[mid] == find) {
				if(searchType.equals(BinarySearchType.FIRST)) {
					int firstIndex = -1;
					if(mid-1 >= left && arr[mid-1] == arr[mid]) {
						firstIndex = binarySearch(arr, left, mid-1, find, searchType);
					} else {
						firstIndex = mid;
					}
					return firstIndex;
				} else {
					int lastIndex = -1;
					if(mid+1 <= right && arr[mid+1] == arr[mid]) {
						lastIndex = binarySearch(arr, mid+1, right, find, searchType);
					} else {
						lastIndex = mid;
					}
					return lastIndex;
				}
			} else if(arr[mid] > find) {
				return binarySearch(arr,left,mid,find,searchType);
			} else {
				return binarySearch(arr,mid+1,right,find,searchType);
			}
		} else {
			return -1;
		}
	}

}

enum BinarySearchType{
	FIRST,LAST;
}

