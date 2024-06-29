package com.hrishi.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "ABCDEFGABEF";
        char[] arr = str.toCharArray();

        int left = 0;
        int max = 0;
        int right = 0;
        Map<Character,Integer> charPos = new HashMap<>();

        while(right < str.length()) {
            if(charPos.containsKey(arr[right]) && charPos.get(arr[right]) >= left) {
                left = charPos.get(arr[right]) + 1;
                charPos.put(arr[right], right);
                max = Math.max(max, (right-left+1));
            } else {
                charPos.put(arr[right], right);
                max = Math.max(max, (right-left+1));
            }
            right++;
        }

        System.out.println(charPos);
        System.out.println(max);

    }
}
