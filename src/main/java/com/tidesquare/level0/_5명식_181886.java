package com.tidesquare.level0;

import java.util.Arrays;

public class _5명식_181886 {
    public static void main(String[] args) {
        String[] names = new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] answer = new String[names.length/5 + (names.length%5 != 0 ? 1 : 0)];
        int cnt=0;
        for (int i = 0; i < names.length; i++) {
            if (i%5==0) answer[cnt++] = names[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
