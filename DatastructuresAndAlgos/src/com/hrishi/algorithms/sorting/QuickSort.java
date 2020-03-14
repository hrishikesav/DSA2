package com.hrishi.algorithms.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] data = {5,3,12,56,2,9,8};
		quickSort(data, 0, data.length-1);
		for(Integer i: data) {
			System.out.println(i);
		}
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int mid = low + (high-low)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		
		while(i<=j) {
			if(low>high) {
				return;
			}
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			
			if(i<=j) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
				i++;
				j--;
			}
			
			if(low < j) {
				quickSort(arr, low, j);
			}
			if(high > i) {
				quickSort(arr, i, high);
			}
		}
	}
}
