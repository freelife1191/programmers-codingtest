package com.tidesquare.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mskwon on 2025. 3. 25..
 */
public class _x사이의개수_181867 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";

        // int[] answer = Arrays.stream(myString.split("x", myString.length())).mapToInt(String::length).toArray();
        int[] answer = Arrays.stream(myString.split("x", -1)).mapToInt(String::length).toArray();
        // List<Integer> answer = Arrays.stream(myString.split("x")).map(String::length).collect(Collectors.toList());
        // if (myString.endsWith("x")) answer.add(0);
        System.out.println(Arrays.toString(answer));
    }
}