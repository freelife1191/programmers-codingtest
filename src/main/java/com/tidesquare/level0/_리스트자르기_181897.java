package com.tidesquare.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _리스트자르기_181897 {
    public static void main(String[] args) {
        int n = 2;
        int[] slicer = new int[]{1,5,2};
        int[] num_list = new int[]{1,2,3,4,5,6,7,8,9};
        int start= n == 1 ? 0 : slicer[0];
        int end= n == 2 ? num_list.length - 1 : slicer[1];
        int step= n == 4 ? slicer[2]: 1;
        System.out.println((end - start + step)/step);
        // 정답 배열 길이를 위해 end - start 는 1이 부족하므로 +1
        // step은 2의 경우 절반씩 차감되므로 / 해야하고 1은 나눠도 변화가 없음
        int[] answer = new int[(end - start + step) / step];
        for (int i=start, j=0; i <= end; i+=step) {
            answer[j++] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
/*
public static void main(String[] args) {
    int n = 1;
    int[] slicer = new int[]{1,5,2};
    int[] num_list = new int[]{1,2,3,4,5,6,7,8,9};
    int start= slicer[0];
    // num_list[0] - slicer[1]
    List<Integer> answer = new ArrayList<>();
    for (int i = n == 1 ? 0 : slicer[0]; i < num_list.length; i++) {
        if (n == 1 && i <= slicer[1]) answer.add(num_list[i]);
        else if(n == 2) answer.add(num_list[i]);
        else if (slicer[0] <= i && i <= slicer[1]) {
            if (n == 3) answer.add(num_list[i]);
            else if (n == 4 && i == start) {
                start+=slicer[2];
                answer.add(num_list[i]);
            }
        }
    }
    // IntStream.iterate(n == 1 ? 0 : slicer[0], i -> i <= (n == 2 ? num_list.length - 1 : slicer[1]), i -> n == 4 ? i + slicer[2] : i + 1)
    //         .map(i -> num_list[i])
    //         .toArray();
    System.out.println(answer);
}
*/
