package com.hrishi.problems.arrays;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
         int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int res = logSubArr(arr,3);
        System.out.println("Result=" + res);
    }

    static int logSubArr(int[] arr, int k) {
        int retVal = Integer.MIN_VALUE;

        int i=0;
        int j=1;
        int tempSum = 0 + arr[0];
        int tempCount = 1;
        while(j < arr.length) {
            if(tempSum + arr[j] == k) {
                tempCount++;
                if(tempCount > retVal) {
                    retVal = tempCount;
                }
                tempSum = tempSum + arr[j];
                j++;
            } else if (tempSum + arr[j] < k) {
                tempCount++;
                tempSum = tempSum + arr[j];
                j++;
            } else {
                tempCount--;
                tempSum = tempSum - arr[i];
                i++;
            }
        }

        return retVal;
    }
}
