package com.tidesquare.level0;

import java.util.stream.Collectors;

public class _l로_만들기_181834 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        char a = 'l'; // 108
        for (char c : myString.toCharArray()) {
            myString = myString.replace(c, c < a ? a : c);
        }
        System.out.println(myString);
        // l-z 가 아니면 l로 바꿔라
        // myString.replaceAll("[^l-z]", "l");
        // a-k 면 l로 바꿔라
        // myString.replaceAll("[a-k]", "l");
        // return myString.chars()
        //         .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
        //         .collect(Collectors.joining());
    }
}
