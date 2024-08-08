package com.hrishi.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicateCountStream {
    public static void main(String[] args) {
        String str = "there is a tree tree has leaves leaves are green";
        String[] strings = str.split(" ");
        List<String> list = new ArrayList<>(List.of(strings));
        List<String> result = list.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println("result = " + result);

        List<Map.Entry<String, Long>> collect = list.stream().collect(Collectors.groupingBy(l -> l, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).toList();
        System.out.println("collect = " + collect);
    }
}
