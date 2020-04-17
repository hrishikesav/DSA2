package com.hrishi.problems.strings;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
//		String s = "abccbde";
		String s = "racecar";
		System.out.print(longestPalindromicSubstring(s));
		System.out.println();
		System.out.print(longestPalindromeString(s));
	}
	
	// Approach 1 (Own)
	static String longestPalindromicSubstring(String s) {
		String str = "";
		
		for(int i=0; i<s.length(); i++) {
			int k = s.length() - 1;
			int c = i;
			int startSub = i;
			int endSub = -1;
			while(k >= c) {
				if(s.charAt(c) != s.charAt(k)) {
					startSub = -1;
					endSub = -1;
					
					if(endSub != -1) {
						break;
					}
				} else if(endSub == -1) {
					startSub = i;
					endSub = k;
				}
				k--;
				
				if(endSub != -1) {
					c++;
				}
			}
			if(startSub != -1) {
				String temp = s.substring(startSub, endSub+1);
				if(temp.length() > str.length()) {
					str = temp;
				}
			}
		}
		
		return str;
	}
	
	//Approach 2
	static String longestPalindromeString(String s) {
		String str = "";
		if(s == null || s.length() < 1) {
			str = "";
		} else {
			int start = 0;
			int end = 0;
			for(int i=0; i<s.length(); i++) {
				int len1 = expandFromMiddle(s, i, i);
				int len2 = expandFromMiddle(s, i, i+1);
				int len = Math.max(len1, len2);
				if(len > end-start) {
					start = i - ((len-1)/2);
					end = i + (len/2);
				}
			}
			str = s.substring(start, end+1);
		}
		
		return str;
	}
	
	static int expandFromMiddle(String s, int left, int right) {
		int ret = 0;
		if(s.length() == 0 || left > right) {
			ret = 0;
		} else {
			while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
			}
		}
		ret = right -left -1;
		return ret;
		
	}

}
