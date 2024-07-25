package com.hrishi.datastructures.stack;

import java.util.Stack;

public class LongestRectangleHistogrmMaxArea {
    public static void main(String[] args) {
//        int[] arr = {4,2,8,6,5,3};
        int[] arr = {2,1,5,6,2,3};
        int[] nextSmallArr = nextSmallElement(arr);

        System.out.println("nextSmallElement ");
        for(int i: nextSmallArr) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("prevSmallElement ");
        int[] prevSmallArr = prevSmallElement(arr);

        for(int i: prevSmallArr) {
            System.out.print(i + " ");
        }

        System.out.println("\nMax Area: " + maxArea(nextSmallArr, prevSmallArr, arr));

    }

    static int maxArea(int[] nextSmallArr, int[] prevSmallArr, int[] arr ) {
        int maxA = Integer.MIN_VALUE;

        for(int i=0; i<arr.length-1; i++) {
            int area = (nextSmallArr[i] - prevSmallArr[i] -1) * arr[i];

            if(area > maxA) {
                maxA = area;
            }
        }

        return maxA;
    }

    static int[] prevSmallElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length-1; i++) {
            if(stack.isEmpty()) {
                stack.push(i);
                result[i] = 0;
            } else {
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }

                if(stack.isEmpty()) {
                    result[i] = 0;
                } else {
                    result[i] = stack.peek();
                }
                stack.push(i);
            }
        }


        return result;
    }

    static int[] nextSmallElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            if(stack.isEmpty()) {
                stack.push(i);
                result[i] = -1;
            } else {
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }

                if(stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }

                stack.push(i);
            }
        }


        return result;
    }
}
