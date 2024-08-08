package com.hrishi.hackerrank.strings;

import java.util.*;

public class GroupStringAnagramsTogether {

    public static void main(String[] args) {
        String[] arr = {"salt","loop","last","pool","slat"};
        Map<String, List<String>> map = new HashMap<>();

        /*
        The char sorted version of all anagrams will be the same string.
        That sorted string will be the key in the map for all its anagrams.
         */

        for(String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newString = new String(chars);

            if(map.containsKey(newString)) {
                map.get(newString).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(newString, list);
            }
        }

        System.out.println("map=" + map.values());
    }
}
