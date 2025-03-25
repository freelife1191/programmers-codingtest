package com.tidesquare.level0;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 3. 25..
 */
public class _문자열잘라서정렬하기_181866 {
    public static void main(String[] args) {
        String myString = "axbxcxdx";
        String[] answer = Arrays.stream(myString.split("x")).filter(s -> !s.isBlank()).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(answer));
    }
}
