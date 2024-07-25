package com.hrishi.datastructures.stack;

import java.util.Stack;

public class PreviousSmallestElement {

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3,1};
        int[] resultArr = new int[arr.length];

        int[] res = prevSmall(arr,resultArr);
        for(int i: res) {
            System.out.print(i + " ");
        }
    }

    static int[] prevSmall(int[] arr, int[] resultArr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                resultArr[i] = -1;
                stack.push(arr[i]);
                continue;
            }

            while(!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                resultArr[i] = -1;
            } else {
                resultArr[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return resultArr;
    }
}
