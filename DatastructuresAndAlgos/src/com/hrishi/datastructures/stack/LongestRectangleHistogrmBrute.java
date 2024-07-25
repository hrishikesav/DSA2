package com.hrishi.datastructures.stack;

public class LongestRectangleHistogrmBrute {
    static int maxArea = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] histo = {4,2,8,6,5,3};
//        int[] histo = {2,1,5,6,2,3};
        histoArea(histo);
        System.out.println("Max area=" + maxArea);
    }

    static void histoArea(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int width = 1;
            int height = arr[i];

            int back = i-1;
            while(back >= 0) {
                if(arr[back] >= arr[i]) {
                    width++;
                    back--;
                    continue;
                }
                break;
            }

            int nxt = i+1;
            while(nxt < arr.length) {
                if(arr[i] <= arr[nxt]) {
                    width++;
                    nxt++;
                    continue;
                }
                break;
            }

            int area = width * height;
            if(area > maxArea) {
                maxArea = area;
            }
        }
    }
}
