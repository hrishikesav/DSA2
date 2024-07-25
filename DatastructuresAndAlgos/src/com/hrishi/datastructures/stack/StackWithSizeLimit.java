package com.hrishi.datastructures.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackWithSizeLimit {
    static Stack<Integer> current;
    static List<Stack<Integer>> stackList = new LinkedList<>();
    static int STACK_LIMIT = 2;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        System.out.println("pop()=" + pop());
        System.out.println("pop()=" + pop());

        System.out.println("popAt(0)=" + popAt(0));

        System.out.println("stackList=" + stackList);
    }

    static int popAt(int index) {
        int stackIndex=0;
        int retValue = -1;
        for(int i : current) {
            if(stackIndex == index) {
                retValue = i;
                break;
            }
            stackIndex++;
        }
        return retValue;
    }

    static void push(int value) {
        if(null == current || current.size() == STACK_LIMIT) {
            current = new Stack<>();
            stackList.add(current);
        }

        current.push(value);
    }

    static int pop() {
        int retValue = -1;

        if(null != current) {
            retValue = current.pop();

            if(current.size() == 0) {
                stackList.remove(stackList.size()-1);
                current = stackList.get(stackList.size()-1);
            }
        }
        return retValue;
    }
}
