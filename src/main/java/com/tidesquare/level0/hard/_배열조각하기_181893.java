package com.tidesquare.level0.hard;

import java.util.Arrays;

public class _배열조각하기_181893 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5};
        // arr = new int[]{100, 10};
        int[] query = new int[]{4,1,2};
        // query = new int[]{1};
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }
        arr = Arrays.copyOfRange(arr, start, end + 2);
        System.out.println(Arrays.toString(arr));
    }
}
/*
public static void main(String[] args) {
    int[] arr = new int[]{0,1,2,3,4,5};
    // arr = new int[]{100, 10};
    int[] query = new int[]{4,1,2};
    // query = new int[]{1};
    for(int i=0; i<query.length; i++) {
        arr = i%2==0?Arrays.copyOf(arr, query[i] + 1):Arrays.copyOfRange(arr, query[i], arr.length);
    }
    // arr = IntStream.range(0, query.length)
    //         .boxed()
    //         .reduce(arr, (current, next) -> next % 2 == 0 ?
    //                         Arrays.copyOfRange(current, 0, query[next] + 1) :
    //                         Arrays.copyOfRange(current, query[next], current.length),
    //                 (a, b) -> a);
    System.out.println(Arrays.toString(arr));
}
*/

/*
public static void main(String[] args) {
    int[] arr = new int[]{0,1,2,3,4,5};
    // arr = new int[]{100, 10};
    int[] query = new int[]{4,1,2};
    // query = new int[]{1};
    Deque<Integer> list = new ArrayDeque<>();
    for (int i : arr) {
        list.add(i);
    }
    for (int i = 0; i < query.length; i++) {
        int len = list.size();
        int q = query[i];
        if (i % 2 == 0) {
            for (int j = 1; j < len - q; j++) {
                list.pollLast();
            }
        } else {
            for (int j = 0; j < q; j++) {
                list.pollFirst();
            }
        }
    }
    int[] answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
        answer[i] = list.pollFirst();
    }
    System.out.println(Arrays.toString(answer));
}
 */