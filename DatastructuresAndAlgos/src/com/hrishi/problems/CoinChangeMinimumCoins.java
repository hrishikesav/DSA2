package com.hrishi.problems;

import java.util.ArrayList;
import java.util.List;

/*
 * This gets the minimum possible coins needed to get to the amount(num).
 * 
 * To get all the possible combinations to get to the amount(num) see below class:
 * {CoinChangeAllPossibleCombinations}
 */
public class CoinChangeMinimumCoins {
	
	public static void main(String[] args) {

		int[] coins = { 1, 2, 3 };
		int num = 10;
		List<Integer> result = new ArrayList<>();

		coinChange(coins, num, num, result, coins.length - 1);

	}

	static void coinChange(int[] coins, int num, int remSum, List<Integer> result, int level) {
		
		if (remSum == 0) {
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			return;
		}

		while (remSum - coins[level] < 0) {
			level--;
			if(level < 0) {
				System.out.println("Combination not possible.");
				return;
			}
		}

		int nAdd = coins[level];
		result.add(nAdd);
		coinChange(coins, num, remSum - nAdd, result, level);
		result.remove(result.size() - 1);

	}

}
