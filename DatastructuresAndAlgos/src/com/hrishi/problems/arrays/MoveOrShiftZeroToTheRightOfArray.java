package com.hrishi.problems.arrays;

public class MoveOrShiftZeroToTheRightOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        moveZeroes(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void moveZeroes(int[] arr) {
        int zeroInd = nextZeroIndex(arr, 0);

        for(int i=zeroInd+1; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[zeroInd] = arr[i];
                arr[i] = 0;
                zeroInd = nextZeroIndex(arr, zeroInd+1);
            }
        }
    }

    static int nextZeroIndex(int[] arr, int pos) {
        int returnVal = Integer.MAX_VALUE-1;
        for(int i=pos; i<arr.length; i++) {
            if(arr[i] == 0){
                returnVal = i;
                break;
            }
        }

        return returnVal;
    }
}
