package com.tidesquare.level0;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by mskwon on 2025. 3. 17..
 */
public class _9로나눈나머지_181914 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        // int sum = 0;
        // for (char c : number.toCharArray()) {
        //     sum += Integer.parseInt(String.valueOf(c));
        // }
        // char ASCII 코드에서 0 을 빼면 원하는 숫자가 추출되고 그 총 합계를 9로 나눈 나머지를 구함
        // 각 숫자마다 9를 나눈 나머지를 왜 구하는지는 의문
        // return number.chars().map(c -> (c - '0') % 9).sum() % 9;
        int sum = number.chars().map(c -> (c - '0')).sum() % 9;
        // int sum = number.chars().map(c -> Integer.parseInt(String.valueOf((char)c))).sum();
        // System.out.println(sum);
        System.out.println(sum%9);
    }
}
