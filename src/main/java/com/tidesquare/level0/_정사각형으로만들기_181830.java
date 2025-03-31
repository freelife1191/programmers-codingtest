package com.tidesquare.level0;
import java.util.Arrays;


/**
 * Created by mskwon on 2025. 3. 31..
 */
public class _정사각형으로만들기_181830 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        arr = new int[][]{{1, 2}, {3, 4}};
        arr = new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}};
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max][max];
        for (int i = 0; i < answer.length; i++) {
            if (i <= arr.length - 1) answer[i] = Arrays.copyOf(arr[i], max);
        }
        System.out.println(Arrays.deepToString(answer));
    }
}
/*
public int[][] solution(int[][] arr) {
    int max = Math.max(arr.length, arr[0].length);
    int[][] array = new int[max][max];

    for (int i = 0; i < arr.length; i++) {
        System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
    }
    return array;
}
*/
/*
public int[][] solution(int[][] arr) {
    int max = arr.length > arr[0].length ?
                                        arr.length : arr[0].length;
    int[][] result = new int[max][max];
    for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++)
                result[i][j] = arr[i][j];
    return result;
}
*/
