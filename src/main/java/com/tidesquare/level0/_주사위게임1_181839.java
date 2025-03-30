package com.tidesquare.level0;

public class _주사위게임1_181839 {
    public static void main(String[] args) {
        int a = 2, b = 4;
        int answer = 0;
        if (a%2 == 1 && b%2 == 1) answer = a*a + b*b;
        else if (a%2 == 0 && b%2 == 0) answer = Math.abs(a-b);
        else if (a%2 == 1 || b%2 == 1) answer = 2*(a+b);
        System.out.println(answer);
        // return (a%2==1&&b%2==1?a*a+b*b:(a%2==1||b%2==1?2*(a+b):(a>b?a-b:b-a)));
    }
}
