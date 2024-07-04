package com.hrishi.problems.matrix;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RiverSizes {

    static int rowSize = 5;
    static int colSize = 5;
    static Queue<Pair> queue = new LinkedList<>();
    static boolean[][] visited = new boolean[rowSize][colSize];
    static int count = 0;
    static List<Integer> riverCount = new LinkedList<>();
    public static void main(String[] args) {
        int[][] input = {{1,0,0,1,0},
                {1,0,1,0,0},
                {0,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,1,0}};
        printArr(input);

        int r = 0,c = 0;
        while(r < rowSize) {
            c = 0;
            while(c < colSize) {
                if(!visited[r][c]) {
                    countRivers(r,c,input);
                    if(count > 0) {
                        riverCount.add(count);
                        count = 0;
                    }
                }
                c++;
            }
            r++;
        }
        printArr(visited);
        System.out.println("River size counts = " + riverCount);
    }

    static void countRivers(int r, int c, int[][] input) {
        if(r < rowSize && c < colSize && r >= 0 && c >= 0 && !visited[r][c]) {
            if(input[r][c] == 1) {
                count++;
                queue.add(new Pair(r, c));
                visited[r][c] = true;
                if(c-1 >= 0) {
                    countRivers(r,c-1,input);
                }

                if(r-1 >= 0) {
                    countRivers(r-1,c,input);
                }

                if(c+1 < colSize) {
                    countRivers(r,c+1,input);
                }

                if(r+1 < rowSize) {
                    countRivers(r+1,c,input);
                }
            } else {
                visited[r][c] = true;
            }

        } else {
            return;
        }

        if(!queue.isEmpty()) {
            Pair pair = queue.poll();
            countRivers(pair.getX(), pair.getY(), input);
        }
    }

    static void printArr(boolean[][] arr) {
        for(int i=0; i<rowSize; i++) {
            for(int j=0; j<colSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArr(int[][] arr) {
        for(int i=0; i<rowSize; i++) {
            for(int j=0; j<colSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class Pair {
        int x,y;
         public Pair(int x, int y) {
             this.x = x;
             this.y = y;
         }

         public int getX() {
             return this.x;
         }

         public int getY() {
             return this.y;
         }
    }

}
