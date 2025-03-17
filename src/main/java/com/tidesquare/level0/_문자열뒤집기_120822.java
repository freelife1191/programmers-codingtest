package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 1. 7..
 */
public class _문자열뒤집기_120822 {
    public static String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("hello"));
    }
}