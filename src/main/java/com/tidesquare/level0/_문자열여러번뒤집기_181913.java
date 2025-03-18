package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 18..
 */
public class _문자열여러번뒤집기_181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = new int[][]{{2,3},{0,7},{5,9},{6,10}};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queries.length; i++) {
            // sb 에 reverse 해야될 부분을 잘라 넣음
            sb.append(my_string.substring(queries[i][0], queries[i][1]+1));
            // my_string 문자 시작에서 reverse 시작점 + 뒤집은거 넣고 + my_string 후반부
            my_string = my_string.substring(0, queries[i][0]) + sb.reverse() +  my_string.substring(queries[i][1] + 1);
            // sb를 초기화해서 재활용
            sb.setLength(0);
        }
        System.out.println(my_string);
    }
}
// 내 풀이 장황함
/*
public static void main(String[] args) {
    String my_string = "rermgorpsam";
    StringBuilder sb = new StringBuilder(my_string);
    int[][] queries = new int[][]{{2,3},{0,7},{5,9},{6,10}};
    for (int i = 0; i < queries.length; i++) {
        System.out.println("queries["+i+"]["+0+"]="+queries[i][0]+", queries["+i+"][1]="+queries[i][1]);;
        System.out.println(new StringBuilder(sb.substring(queries[i][0], queries[i][1])).reverse().toString());
        sb = new StringBuilder(sb.replace(queries[i][0], queries[i][1]+1, new StringBuilder(sb.substring(queries[i][0], queries[i][1]+1)).reverse().toString()));
    }
    System.out.println(sb);
}
*/
/*
static char[] arr;
public static String solution(String my_string, int[][] queries) {
    arr = my_string.toCharArray();

    for (int[] query : queries) {
        reverse(query[0], query[1]);
    }

    return new String(arr);
}

private static void reverse(int s, int e) {
    // start 가 end 보다 작으면 true
    while (s < e) {
        // start 를 임시에 보관
        char temp = arr[s];
        // start를 e로 교체시키고 start를 증가
        arr[s++] = arr[e];
        // 임시로 보관된 start로 e를 교체하고 e를 감소시킴
        arr[e--] = temp;
    }
}

public static void main(String[] args) {
    String my_string = "rermgorpsam";
    int[][] queries = new int[][]{{2,3},{0,7},{5,9},{6,10}};
    System.out.println(solution(my_string, queries));
}
*/