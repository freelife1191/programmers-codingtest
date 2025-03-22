package com.tidesquare.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _qrcode_181903 {
    public static void main(String[] args) {
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < code.length(); i++) {
        //     if (i%q == r) sb.append(code.charAt(i));
        // }
        // System.out.println(sb);
        // String answer = IntStream.range(0, code.length())
        //         .filter(i -> i%q == r)
        //         .mapToObj(i -> String.valueOf(code.charAt(i)))
        //         .collect(Collectors.joining());
        // System.out.println(answer);
        StringBuilder sb = new StringBuilder();
        // 인덱스를 q로 나눈 나머지가 r이니까 q의 배수이므로 q씩 증가
        for (int i = r; i < code.length(); i += q)
            sb.append(code.charAt(i));
        System.out.println(sb);
    }
}
