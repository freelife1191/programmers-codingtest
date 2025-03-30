package com.tidesquare.level0;

import java.util.Arrays;

public class _뒤에서5등까지_181853 {
    public static void main(String[] args) {
        int[] num_list = new int[]{12, 4, 15, 46, 38, 1, 14};
        Arrays.sort(num_list);
        System.out.println(Arrays.toString(Arrays.copyOf(num_list, 5)));
        Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}
