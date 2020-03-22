package com.hrishi.problems.arrays;

public class StockPriceHighestProfit {

	public static void main(String[] args) {
		
		int[] arr = {310,315,275,295,260,270,290,230,255,250};
		
		int i = 0;
		int startStreak = arr[0];
		int maxProfit = 0;
		
		while(i < arr.length-1) {
			if(arr[i+1] > arr[i]) {
				maxProfit = Math.max(maxProfit, arr[i+1] - startStreak);
				i++;
			} else {
				startStreak = arr[i+1];
				i++;
			}
		}
		System.out.println("Max profit = " + maxProfit);
	}

}
