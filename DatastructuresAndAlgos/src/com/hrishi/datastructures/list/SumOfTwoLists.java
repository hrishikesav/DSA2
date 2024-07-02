package com.hrishi.datastructures.list;

public class SumOfTwoLists {

    public static void main(String[] args) {
        int[] arr1 = {2,1,4,9,8,3,7};
        int[] arr2 = {4,8,9,7};

        int[] result = sum(arr1, arr2);
        for(int i=result.length-1; i>=0; i--) {
            System.out.print(result[i]);
        }
    }

    static int[] sum(int[] arr1, int[] arr2) {
        if(arr2.length > arr1.length) {
            return sum(arr2,arr1);
        }
        int n1 = arr1.length-1;
        int n2 = arr2.length-1;
        int rem = 0;
        int[] result = new int[n1+1];
        int resultInd = 0;

        while(n1 >= 0) {
            int s1 = arr1[n1];
            int s2 = 0;

            if(n2 >= 0) {
                s2 = arr2[n2];
                n2--;
            }

            int sum = s1+s2+rem;
            if(sum > 10) {
                rem = 1;
                result[resultInd] = sum-10;
            }else {
                rem = 0;
                result[resultInd] = sum;
            }
            resultInd++;
            n1--;
        }

        return result;

    }
}
