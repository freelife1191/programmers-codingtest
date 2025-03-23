package com.tidesquare.level0.hard;

import java.util.Arrays;

public class _문자개수세기_181902 {
    public static void main(String[] args) {
        String my_string = "Programmers";
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()) {
            if (c >= 'a') answer[c - 'a' + 26]++;
            else answer[c - 'A']++;
        }
        // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0]
        // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0,0,0,0,0,0,0]
        System.out.println(Arrays.toString(answer));
    }
}
/*
public static void main(String[] args) {
    String my_string = "Programmers";
    System.out.println((int) 'a'- 'A'- 6);
    System.out.println((int) 'z'- 'A');
    System.out.println((int) 'A'- 'A');
    System.out.println((int) 'Z' -'A');
    int[] answer = new int[52];
    // Arrays.fill(answer, 0);
    for (char c : my_string.toCharArray()) {
        // System.out.println(c - 'A' - ((c >= 97 && c <= 122) ? 6 : 0));
        answer[c - 'A' - ((c >= 97 && c <= 122) ? 6 : 0)]++;
    }
    // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0]
    // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0,0,0,0,0,0,0]
    System.out.println(Arrays.toString(answer));
}
*/
