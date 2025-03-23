package com.tidesquare.level0;

import java.util.Arrays;

public class _조건에맞게수열변환하기2_181881 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 100, 99, 98};

        int asInt = Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
        // 63, 2, 63, 51, 99, 99
        // [5, 0, 4, 3, 0, 2]
        System.out.println(asInt);
    }

    // arr의 각 원소들의 값의 변화 횟수를 카운트해서 그 중 가장 많은 변화 횟수를 응답
    private static int cntAction(int n) {

        int cnt = 0;
        boolean flag = true;

        while (flag) {

            if (n % 2 == 0 && 50 <= n) {
                n /= 2;
                cnt++;
            } else if (n % 2 == 1 && n < 50) {
                n *= 2;
                n += 1;
                cnt++;
            } else {
                flag = false;
            }
        }
        System.out.println(n);
        return cnt;
    }
}
/*
public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 100, 99, 98};
    int[] diff_arr = new int[0];
    // 50 <= i % 2 == 0
    // 50 >= i % 3 == 0 * 2 + 1
    int x = 0;
    while (!Arrays.equals(arr, diff_arr)) {
        diff_arr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2 + 1;
            }
        }
        if (!Arrays.equals(arr, diff_arr)) x++;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(x);
}
*/
