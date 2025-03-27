package com.tidesquare.level0;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by mskwon on 2025. 3. 26..
 */
public class _배열의_원소만큼_추가하기_181861 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 4};
        int[] array = Arrays.stream(arr).mapToObj(i -> {
            int[] nums = new int[i];
            Arrays.fill(nums, i);
            return nums;
        }).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(array));
        // 모두 같은 값으로 초기화할때 nCopies
        // Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
    }
}
/*
public int[] solution(int[] arr) {
    String answer = "";
    for(int i: arr) {
        answer += (String.valueOf(i)+",").repeat(i);
    }
    return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray();
}
*/
