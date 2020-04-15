package com.hrishi.hackerrank.warmup;

public class JumpingOnClouds {

	public static void main(String[] args) {

		int[] arr = {0,0,0,0,1,0};
		System.out.println(jumpingClouds(arr));
	}

	static int jumpingClouds(int[] c) {
		int jumps = 0;
		
		int i = 0;
		while(i<(c.length -1)) {
			if(c[i] == 0) {
				if((i+2) < c.length && c[i+2] == 0) {
					i += 2;
					++jumps;
				} else if((i+1) < c.length && c[i+1] ==0){
					++i;
					++jumps;
				}
			} else {
				++i;
			}
		}
		
		return jumps;
	}
}
