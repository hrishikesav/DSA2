package com.hrishi.problems.arrays;

import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayTraversal2D {

    static Set<Point> pathSet = new LinkedHashSet<>();
    static boolean found = false;

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArrary(arr);
        traverse(arr,0,0);
        System.out.println("PathSet=" + pathSet);
    }

    static void traverse(int[][] arr, int x, int y) {
        if(x <= 2 && y <= 2 && !found) {
            pathSet.add(new Point(x, y));

            if(x == 2 && y == 2) {
                found = true;
                System.out.println("Target found.");
                return;
            }

            traverse(arr,x,y+1);
            traverse(arr,x+1,y);

        }
    }

    static void printArrary(int[][] arr) {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
