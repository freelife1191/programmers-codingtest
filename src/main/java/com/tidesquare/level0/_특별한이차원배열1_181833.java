package com.tidesquare.level0;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 3. 31..
 */
public class _특별한이차원배열1_181833 {
    public static void main(String[] args) {
        int n = 3;
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // answer[i][j] = i == j ? 1 : 0;
                answer[i][i] = 1;
            }
        }
        System.out.println(Arrays.deepToString(answer));
        // return IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> j == i ? 1 : 0).toArray()).toArray(int[][]::new);
    }
}
/*
public int[][] solution(int n) {
    int[][] answer = new int[n][n];

    Arrays.setAll(answer, i -> {
        int[] array = answer[i];
        array[i] = 1;
        return array;
    });
    return answer;
}
*/
