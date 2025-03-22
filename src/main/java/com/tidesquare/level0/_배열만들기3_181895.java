package com.tidesquare.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class _배열만들기3_181895 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[][] intervals = new int[][]{{1,3},{0,4}};
        int s1 = intervals[0][0], e1 = intervals[0][1], s2 = intervals[1][0], e2 = intervals[1][1], idx = 0;
        int[] answer = new int[e1 - s1 + e2 - s2 + 2];

        for (int i = s1; i <= e1; i++) {
            answer[idx++] = arr[i];
        }

        for (int i = s2; i <= e2; i++) {
            answer[idx++] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
        int[] answer2 = Arrays.stream(intervals)
                .flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1)))
                .toArray();
        System.out.println(Arrays.toString(answer2));
    }
}
/*
public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5};
    int[][] intervals = new int[][]{{1,3},{0,4}};
    int[] a = new int[0];
    int[] b = new int[0];
    int asize = 0;
    int bsize = 0;
    for (int i = 0; i < intervals.length; i++) {
        int start = intervals[i][0];
        int end = intervals[i][1];
        int[] arrays = Arrays.copyOfRange(arr, start, end);
        if (i == 0) {
            a = Arrays.copyOfRange(arr, start, end+1);
            asize = a.length;
        } else {
            b = Arrays.copyOfRange(arr, start, end+1);
            bsize = b.length;
        }
    }
    int[] answer = Arrays.copyOfRange(a, 0, asize + bsize);
    System.arraycopy(b, 0, answer, asize, bsize);
    System.out.println(Arrays.toString(answer));
    // int[] array = Arrays.stream(intervals)
    //         .flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1)))
    //         .toArray();
}
*/
