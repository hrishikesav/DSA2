package com.hrishi.problems.arrays;

public class ShiftArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int pos = 12;
        pos = pos%arr.length;

        reverseElements(arr,0,pos-1);
        reverseElements(arr,pos,arr.length-1);
        reverseElements(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverseElements(int[] arr, int startInd, int endInd) {

        int j = endInd;
        int tillInd = startInd + (endInd-startInd)/2;
        for(int i=startInd; i<=tillInd; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
