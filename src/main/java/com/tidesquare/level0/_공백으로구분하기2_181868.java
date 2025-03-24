package com.tidesquare.level0;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 3. 24..
 */
public class _공백으로구분하기2_181868 {
    public static void main(String[] args) {
        String my_string = " i    love  you";
        String[] answer = Arrays.stream(my_string.split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        answer = my_string.trim().split("[ ]+");
        answer = my_string.trim().split("\\s+");
        System.out.println(Arrays.toString(answer));
    }
}
// nextToken으로 처리하면 공백을 건너뛰고 처리하므로 괜찮은 아이디어임
/*
public String[] solution(String my_string) {
   StringTokenizer st = new StringTokenizer(my_string);
   int N = st.countTokens();
   String[] result = new String[N];
   for (int n = 0;n < N;n++)
       result[n] = st.nextToken();
   return result;
}
*/
