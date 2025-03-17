package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 1. 22..
 */
public class _직각삼각형_출력하기_120823 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}