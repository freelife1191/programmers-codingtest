package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 1. 22..
 */
public class _문자_반복_출력하기_120825 {

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        for (int i = 0; i < my_string.length(); i++) {
            System.out.println(String.valueOf(my_string.charAt(i)).repeat(n));
        }
    }
}
