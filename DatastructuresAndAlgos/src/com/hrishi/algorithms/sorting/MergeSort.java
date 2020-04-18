package com.hrishi.algorithms.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = {6,5,4,3,2,1};
		
		printArray(arr);
		
		mergeSort(arr, 0 , arr.length-1);
		
		printArray(arr);
	}

	static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = left + (right-left)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
	}
	
	static void merge(int[] arr,int left, int mid, int right) {
		int lA = mid - left + 1; 
		int rA = right - mid; 

		int leftArray[] = new int [lA]; 
		int rightArray[] = new int [rA]; 

		for (int i=0; i<lA; ++i) 
			leftArray[i] = arr[left + i]; 
		for (int j=0; j<rA; ++j) 
			rightArray[j] = arr[mid + 1+ j]; 
		
		
		int i=0, j=0, k=left;
		
		while(i < lA && j < rA) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
				k++;
			} else {
				arr[k] = rightArray[j];
				j++;
				k++;
			}
			
		}
		
		while (i < lA) 
		{ 
			arr[k] = leftArray[i]; 
			i++; 
			k++; 
		} 
		
		while(j<rA) {
			arr[k] = rightArray[j];
			k++;
			j++;
		}
	}
	
	static void printArray(int[] arr) {
		for(Integer a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
