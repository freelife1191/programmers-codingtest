package com.tidesquare.level0;

import java.util.stream.Collectors;

/**
 * Created by mskwon on 2025. 3. 26..
 */
public class _문자열바꿔서찾기_181864 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        myString = myString.chars().mapToObj(c -> String.valueOf(c == 'A' ? 'B' : 'A')).collect(Collectors.joining());
        // myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        System.out.println(myString.contains(pat) ? 1 : 0);
    }
}
