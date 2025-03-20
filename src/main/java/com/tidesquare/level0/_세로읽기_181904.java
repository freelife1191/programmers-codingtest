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
        // c지점에 있는 문자열을 꺼내야되는데 char 배열값은 0 부터 시작하므로 c에서 -1
        // m마다 개행하므로 m씩 증감처리 해야됨
        for (int i=c-1; i<my_string.length(); i+=m) {
            System.out.println(i);
            // 그렇게 순회하며 c지점 문자를 모두 취합
            answer += my_string.charAt(i);
        }
        // String answer = IntStream.range(0, my_string.length())
        //         .filter(i -> i % m == (c - 1))
        //         .mapToObj(i -> String.valueOf(my_string.charAt(i)))
        //         .collect(Collectors.joining());
        System.out.println(answer);
    }
}

/*
public static void main(String[] args) {
    String my_string = "haedlwlwod wwdotrvlzd!!!!";
    int m = 2;
    int c = 1;
    String answer = "";
    int n = my_string.length();
    // c지점에 있는 문자열을 꺼내야되는데 char 배열값은 0 부터 시작하므로 c에서 -1
    // m마다 개행하므로 m씩 증감처리 해야됨
    for (int i=c-1; i<n; i+=m) {
        System.out.println(i);
        // 그렇게 순회하며 c지점 문자를 모두 취합
        answer += my_string.charAt(i);
    }
    // IntStream.range(0, my_string.length())
    //     .filter(i -> i % m == c - 1)
    //     .mapToObj(i -> String.valueOf(my_string.charAt(i)))
    //     .collect(Collectors.joining());
    System.out.println(answer);
}
*/
