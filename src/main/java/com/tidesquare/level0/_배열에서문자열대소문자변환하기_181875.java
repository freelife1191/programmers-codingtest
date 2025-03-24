package com.tidesquare.level0;

import java.util.Locale;
import java.util.stream.IntStream;

/**
 * Created by mskwon on 2025. 3. 24..
 */
public class _배열에서문자열대소문자변환하기_181875 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"AAA","BBB","CCC","DDD"};
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (i%2==0) ? strArr[i].toLowerCase() :  strArr[i].toUpperCase();
        }
        // IntStream.range(0, strArr.length).mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
    }
}
