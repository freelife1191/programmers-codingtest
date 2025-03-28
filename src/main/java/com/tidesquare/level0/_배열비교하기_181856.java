package com.tidesquare.level0;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 3. 28..
 */
public class _배열비교하기_181856 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{49, 13};
        int[] arr2 = new int[]{70, 11, 2};
        int answer = 0;
        if (arr1.length < arr2.length) answer = -1;
        else if (arr1.length > arr2.length) answer = 1;
        else {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            if (sum1 > sum2) answer = 1;
            else if(sum1 < sum2) answer = -1;
        }
        System.out.println(answer);
    }
}
/*
public int solution(int[] arr1, int[] arr2) {
    int answer = Integer.compare(arr1.length, arr2.length);

    if(answer == 0) {
        answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
    }

    return answer;
}
*/
