package com.tidesquare.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mskwon on 2025. 3. 20..
 */
public class _세로읽기_181904 {
    public static void main(String[] args) {
        String my_string = "haedlwlwod wwdotrvlzd!!!!";
        int m = 2;
        int c = 1;
        String answer = "";
        int n = my_string.length();
        for (int i=c-1; i<n; i+=m) {
            System.out.println(i);
            answer += my_string.charAt(i);
        }
        // IntStream.range(0, my_string.length())
        //     .filter(i -> i % m == c - 1)
        //     .mapToObj(i -> String.valueOf(my_string.charAt(i)))
        //     .collect(Collectors.joining());
        System.out.println(answer);
    }
}
