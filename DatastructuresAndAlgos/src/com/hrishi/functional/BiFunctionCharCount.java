package com.hrishi.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionCharCount {

    public static void main(String[] args) {
        Map<Character, Integer> charCount = new HashMap<>();
        String str = "BiFunctionCharCount";

        BiFunction<Character, Integer, Integer> count = (k, v) -> ((v == null) ? 1 : ++v);

        for(char c : str.toCharArray()) {
            charCount.compute(c, count);
        }

        System.out.println("charCount = " + charCount);
    }
}
