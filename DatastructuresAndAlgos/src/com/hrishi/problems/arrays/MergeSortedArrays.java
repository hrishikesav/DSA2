package com.hrishi.problems.arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {4,7,8,10};
        int[] arr2 = {5,9,11};

        mergeArray(arr1, arr2);
    }

    public static void mergeArray(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        int[] resultArr = new int[n];

        while(p < n) {
            if(p2 >= n2) {
                while(p1 < n1) {
                    resultArr[p] = arr1[p1];
                    p++;
                    p1++;

                    if(p1 == n1) continue;
                }
            } else {
                while(p1 < n1 && arr1[p1] < arr2[p2]) {
                    resultArr[p] = arr1[p1];
                    p++;
                    p1++;

                    if(p1 == n1) continue;
                }
            }

            if(p1 >= n1) {
                while(p2 < n2) {
                    resultArr[p] = arr2[p2];
                    p++;
                    p2++;
                }
            } else {
                while(p2 < n2 && arr2[p2] < arr1[p1]) {
                    resultArr[p] = arr2[p2];
                    p++;
                    p2++;
                }
            }
        }

        for(int c : resultArr) {
            System.out.print(c + " ");
        }
    }
}
