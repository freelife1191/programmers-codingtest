package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 4. 1..
 */
public class _이차원배열대각선순회하기_181829 {
    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
        int k = 2;
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) answer += board[i][j];
            }
        }
        System.out.println(answer);
        // return IntStream.range(0, board.length).filter(i -> i <= k).map(i -> IntStream.range(0, board[i].length).filter(j -> j <= k - i).map(j -> board[i][j]).sum()).sum();
    }
}
/*
public int solution(int[][] board, int k) {
    int answer = 0;
    for(int i = 0;board.length>i&&i<=k;i++){
        for(int j = 0;board[i].length>j&&j+i<=k;j++)answer+=board[i][j];
    }
    return answer;
}
*/
