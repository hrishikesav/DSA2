package com.hrishi.problems.strings;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationRecursion {

    static Set<String> combs = new HashSet<>();
    public static void main(String[] args) {
        String str = "aabc";
        stringPerm(str, 0);
        System.out.println("combs=" + combs);
    }

    static void stringPerm(String str, int pos) {
        if(pos < str.length()) {
            for(int i=pos;i<str.length();i++) {
                char[] strChar = str.toCharArray();

                char temp = strChar[pos];
                strChar[pos] = strChar[i];
                strChar[i] = temp;

                String newStr = new String(strChar);

                combs.add(newStr);
                stringPerm(newStr, pos+1);
            }
        }
    }
}
