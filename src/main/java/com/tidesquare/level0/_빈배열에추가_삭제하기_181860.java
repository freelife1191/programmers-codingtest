package com.tidesquare.level0;

import java.util.Stack;

/**
 * Created by mskwon on 2025. 3. 27..
 */
public class _빈배열에추가_삭제하기_181860 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 1, 3};
        Stack<Integer> answer = new Stack<>();
        boolean[] flag = new boolean[]{true, false, true, false, false};
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++)
                    answer.add(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; j++)
                    answer.pop();
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i] * (flag[i] ? 2 : 1); j++) {
        //         if (flag[i]) stack.push(arr[i]); else stack.pop();
        //     }
        // }
        System.out.println(answer);
    }
}
