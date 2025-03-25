package com.tidesquare.level0;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by mskwon on 2025. 3. 25..
 */
public class _간단한식계산하기_181865 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        String operator = findOperator(binomial);
        String[] strArr = binomial.split("[+\\-*/]"); // +, -, *, /로 분리
        int num1 = Integer.parseInt(strArr[0].strip());
        int num2 = Integer.parseInt(strArr[1].strip());
        // 연산 수행
        int answer = (int) calculate(num1, num2, operator);
        System.out.println(answer);
    }

    // 연산자 찾는 함수
    private static String findOperator(String expression) {
        if (expression.contains("+")) return "+";
        if (expression.contains("-")) return "-";
        if (expression.contains("*")) return "*";
        if (expression.contains("/")) return "/";
        return null;
    }

    // 연산 수행 함수
    private static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("알 수 없는 연산자: " + operator);
        }
    }
}
