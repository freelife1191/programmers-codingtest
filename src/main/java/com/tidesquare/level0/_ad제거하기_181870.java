package com.tidesquare.level0;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mskwon on 2025. 3. 24..
 */
public class _ad제거하기_181870 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"and","notad","abcd"};

        String[] ads = IntStream.range(0, strArr.length)
                .filter(i -> !strArr[i].contains("ad"))
                .mapToObj(i -> strArr[i]).toArray(String[]::new);
        System.out.println(Arrays.toString(ads));
    }
}
/*
public String[] solution(String[] strArr) {
    int size = 0;
    for(String s : strArr){
        if(!s.contains("ad")){
            size++;
        }
    }

    int idx = 0;
    String[] answer = new String[size];
    for(String s : strArr){
        if(!s.contains("ad")){
            answer[idx++] = s;
        }
    }
    return answer;
}
*/
