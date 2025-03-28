package com.tidesquare.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mskwon on 2025. 3. 28..
 */
public class _문자열묶기_181855 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"a","bc","d","efg","hi"};
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < strArr.length; i++) {
            Integer exist = map.putIfAbsent(strArr[i].length(), 1);
            if (exist != null) map.computeIfPresent(strArr[i].length(), (key, value) -> value + 1);
            if (max < map.get(strArr[i].length())) max = map.get(strArr[i].length());

        }
        System.out.println("max="+max+", map="+map);
        // Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values().stream().max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList()).size();
        // Stream.of(strArr)
        //         .collect(Collectors.groupingBy(String::length, Collectors.counting()))
        //         .entrySet()
        //         .stream()
        //         .max(Comparator.comparing(Map.Entry::getValue))
        //         .get()
        //         .getValue()
        //         .intValue();
    }
}
/*
public int solution(String[] strArr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int answer = 0;
    for (String s : strArr) {
        int key = s.length();
        int value = map.getOrDefault(key, 0) + 1;
        map.put(key, value);
        answer = Math.max(answer, value);
    }
    return answer;
}
*/
/*
public int solution(String[] strArr) {

    int[] counter = new int[31];

    for (String str : strArr) {
        counter[str.length()]++;
    }

    return Arrays.stream(counter).max().getAsInt();
}
*/
/*
public int solution(String[] strArr) {
    int answer = 0;

    int[] lengArr = new int[31];

    for(int i=0; i<strArr.length; i++) {
        lengArr[strArr[i].length()]++;
    }

    for(int i=0; i<=30; i++) {
        answer = Math.max(answer, lengArr[i]);
    }

    return answer;
}
*/
