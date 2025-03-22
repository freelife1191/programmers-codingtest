package com.tidesquare.level0;

import java.util.stream.IntStream;

public class _가까운1찾기_181898 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1, 0, 0};
        arr = new int[]{0,0,0,1};
        arr = new int[]{1,1,1,1,0};
        arr = new int[]{1,1,1,1,0};
        int idx = 3;
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        // answer = IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
        System.out.println(answer);
    }
}
