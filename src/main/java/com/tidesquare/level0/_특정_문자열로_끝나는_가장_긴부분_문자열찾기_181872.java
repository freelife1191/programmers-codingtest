package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 24..
 */
public class _특정_문자열로_끝나는_가장_긴부분_문자열찾기_181872 {
    public static void main(String[] args) {
        String myString = "AAAAaaaa";
        String pat = "a";
        String answer = myString.substring(0, myString.lastIndexOf(pat)+pat.length());
        System.out.println(answer);
    }
}
