package com.tidesquare.level0;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by mskwon on 2025. 3. 25..
 */
public class _간단한식계산하기_181865 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        char op = parts[1].charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
        System.out.println(result);
    }
}
/*
public int solution(String binomial) {
    String[] cal = binomial.split(" ");

    if (cal[1].equals("+")) {
        return (Integer.parseInt(cal[0])) + (Integer.parseInt(cal[2]));
    } else if (cal[1].equals("-")) {
        return (Integer.parseInt(cal[0])) - (Integer.parseInt(cal[2]));
    } else {
        return (Integer.parseInt(cal[0])) * (Integer.parseInt(cal[2]));
    }
}
*/
