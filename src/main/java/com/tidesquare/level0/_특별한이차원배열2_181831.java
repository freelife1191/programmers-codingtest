package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 4. 1..
 */
public class _특별한이차원배열2_181831 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};

        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
        // return IntStream.range(0, arr.length).allMatch(i -> IntStream.range(i + 1, arr.length).allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;
    }
}
