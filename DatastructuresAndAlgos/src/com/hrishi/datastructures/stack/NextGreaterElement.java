package com.hrishi.datastructures.stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,12,5,3,1,2,5,3,1,2,4,6};
        int[] resultArr = new int[arr.length];

        int[] res = nextGreater(arr,resultArr);
        for(int i: res) {
            System.out.print(i + " ");
        }
    }

    static int[] nextGreater(int[] arr, int[] resultArr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            if(stack.isEmpty()) {
                resultArr[i] = -1;
                stack.push(arr[i]);
                continue;
            }

            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
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
