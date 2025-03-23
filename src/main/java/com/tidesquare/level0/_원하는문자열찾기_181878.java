package com.tidesquare.level0;

public class _원하는문자열찾기_181878 {
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        System.out.println(myString.toLowerCase());
        System.out.println(pat.toLowerCase());
        System.out.println(myString.toLowerCase().contains(pat.toLowerCase()));


        int answer = 0;
        if (myString.length() >= pat.length()) answer = myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
