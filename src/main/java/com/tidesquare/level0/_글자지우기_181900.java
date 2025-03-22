package com.tidesquare.level0;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _글자지우기_181900 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = new int[]{1, 16, 6, 15, 0, 10, 11, 3};
        // String answer = IntStream.range(0, my_string.length())
        //         .filter(i -> Arrays.stream(indices).noneMatch(r -> r == i))
        //         .mapToObj(i -> String.valueOf(my_string.charAt(i)))
        //         .collect(Collectors.joining());
        String answer = IntStream.range(0, my_string.length())
                .filter(i -> !IntStream.of(indices).boxed()
                        .collect(Collectors.toSet())
                        .contains(i))
                .mapToObj(my_string::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(answer);
    }
}
