package com.hrishi.problems.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubArrayWithSumKNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        int result = getLargestSum(arr, k);
        System.out.println("Result=" + result);
    }

    static int getLargestSum(int[] arr, int k) {
        int sum = 0;
        int tempCount = 0;
        int finalCount = 0;
        Map<Integer, Integer> mapCount = new LinkedHashMap<>();
        for(int i=0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum == k) {
                tempCount = i + 1;
                finalCount = Math.max(tempCount, finalCount);
            }

            if(!mapCount.containsKey(sum)) {
                mapCount.put(sum, i);
            }

            int rem = sum - k;
            if(mapCount.containsKey(rem)) {
                tempCount = i - mapCount.get(rem);
                finalCount = Math.max(tempCount, finalCount);
            }
        }
        return finalCount;
    }
}
