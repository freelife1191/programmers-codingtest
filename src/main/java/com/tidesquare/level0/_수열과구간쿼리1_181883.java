package com.tidesquare.level0;

import java.util.Arrays;

public class _수열과구간쿼리1_181883 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{0, 1},{1, 2},{2, 3}};
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
