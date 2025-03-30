package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 31..
 */
public class _그림확대_181836 {
    public static void main(String[] args) {
        String[] picture = new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 3;
        String[] answer = new String[picture.length * k];
        for (int i = k-1; i < answer.length; i+=k) {
            StringBuilder sb = new StringBuilder();
            for (char c : picture[i/k].toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            for (int j = i; j > i-k; j--) {
                System.out.println(j);
                answer[j] = sb.toString();
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
