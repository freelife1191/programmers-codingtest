package com.tidesquare.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _2의영역_181894 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,4,5,2,9};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        list = list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1) : Arrays.asList(-1);
        System.out.println(list);
        // int[] answer;
        // int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        // System.out.println("idx="+ Arrays.toString(idx));
        // if (idx.length == 0) answer = new int[]{-1};
        // answer = IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
        // System.out.println(Arrays.toString(answer));
    }
}
/*
public static void main(String[] args) {
    int[] arr = new int[]{1,2,1,4,5,2,9};
    arr = new int[]{1,2,2,2,2,2};
    int start = 0;
    int end = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 2) {
            if (count == 0) {
                start = i;
                end = i;
            }
            else end = i;
            count++;
        }
    }
    System.out.println("start="+start+", end="+end+", count="+count);
    int[] answer = count == 0 ? new int[]{-1} : Arrays.copyOfRange(arr, start, end+1);
    System.out.println(Arrays.toString(answer));
}
*/
