package com.hrishi.problems.strings;

public class LowestCommonSubsequenceOfTwoStrings {

	public static void main(String[] args) {
		
		String s1 = "aggtab";
		String s2 = "gxtxayb";
		System.out.println(getLCS(s1,s2));
		System.out.println(getLCSDynamic(s1,s2));
	}
	
	static int getLCSDynamic(String s1, String s2) {
		int ret = 0;
		
		int s1Len = s1.length();
		int s2Len = s2.length();
		
		// O(s1Len*s2Len)
		
		if(s1Len < 1 || s2Len < 1) {
			ret = 0;
		} else {
			String s1New = s1.substring(0, s1Len-1);
			String s2New = s2.substring(0, s2Len-1);
			if(s1.charAt(s1Len-1) == s2.charAt(s2Len-1)) {
				ret = 1 + getLCSDynamic(s1New, s2New);
			} else {
				ret += Math.max(getLCSDynamic(s1New, s2), getLCSDynamic(s1, s2New));
			}
		}
		
		return ret;
	}
	
	static int getLCS(String s1, String s2) {
		int ret = 0;
		int seqCounter = 0;
		int lastCharFound = 0;
		for(int i=0; i<s1.length(); i++) {
			int s1Counter = i;
			int s2Counter = 0;
			lastCharFound = 0;
			seqCounter = 0;
			while(s1Counter < s1.length()) {
				s2Counter = lastCharFound;
				while(s2Counter < s2.length() && s1Counter < s1.length())  {
					if(s1.charAt(s1Counter) == s2.charAt(s2Counter)) {
						lastCharFound = s2Counter;
						seqCounter++;
						s1Counter++;
						s2Counter++;
					} else {
						s2Counter++;
					}
				}
				s1Counter++;
			}
			if(seqCounter > ret) {
				ret = seqCounter;
			}
		}
		
		
		return ret;
	}

}
