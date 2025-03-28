package com.tidesquare.level0;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 3. 28..
 */
public class _배열의_길이를_2의_거듭제곱으로_만들기_181857 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int i = 1;
        int value = 1;
        while(arr.length > value) {
            value = (int)Math.pow(2, i++);
        }
        System.out.println(String.format("arr=%d, value=%d", arr.length, value));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, value)));
        // Arrays.copyOf(arr, (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2))));
    }
}
/*
public int[] solution(int[] arr) {
    int length = 1;

    while (length < arr.length) {
        length *= 2;
    }

    return Arrays.copyOf(arr, length);
}
*/
/*
public int[] solution(int[] arr) {
    // 최소 2의 거듭제곱 이 나옴
    int siz = (int) Math.pow(2, Integer.toBinaryString(arr.length).length());
    // 최소 2의 거듭제곱이 arr.length 와 같으면 0을 추가할필요 없이 바로 응답
    if (arr.length == siz / 2) return arr;
    // 0을 추가해야되면 siz 만큼 순회하며 0을 추가
    return IntStream.range(0, siz).map(i -> i < arr.length ? arr[i] : 0).toArray();
}
*/