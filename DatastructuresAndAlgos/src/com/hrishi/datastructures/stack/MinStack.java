package com.hrishi.datastructures.stack;

import java.util.Stack;

public class MinStack {
    /*
    getMin() in O(1)
     */

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        push(5);
        push(4);
        push(6);
        push(2);
        push(8);
        System.out.println("getMin()=" + getMin());
        pop();
        System.out.println("getMin()=" + getMin());
        pop();
        System.out.println("getMin()=" + getMin());
    }

    static void push(int value) {
        stack.push(value);

        if(minStack.isEmpty()) {
            minStack.push(value);
        } else {
            if(minStack.peek() > stack.peek()) {
                minStack.push(stack.peek());
            } else {
                minStack.push(minStack.peek());
            }
        }
    }

    static int pop() {
        if(stack.isEmpty()) {
            return -1;
        }

        minStack.pop();
        return stack.pop();
    }

    static int getMin() {
        return minStack.peek();
    }
}
