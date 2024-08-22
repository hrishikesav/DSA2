package com.hrishi.problems.arrays;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        removeDup(arr);


        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void removeDup(int[] arr) {
        int uniqPos = 0;

        for(int i=1; i < arr.length; i++) {
            if(arr[i] != arr[uniqPos]) {
                uniqPos++;
                arr[uniqPos] = arr[i];
            }
        }

        for(int i=uniqPos+1; i<arr.length; i++) {
            arr[i] = -1;
        }

    }
}
