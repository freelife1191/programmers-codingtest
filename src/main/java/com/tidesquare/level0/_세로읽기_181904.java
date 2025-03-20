package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 20..
 */
public class _세로읽기_181904 {
    public static void main(String[] args) {
        String my_string = "haedlwlwod wwdotrvlzd!!!!";
        int m = 2;
        int c = 1;
        String answer = "";
        int n = my_string.length();
        for (int i=c-1; i<n; i+=m) {
            answer += my_string.charAt(i);
        }
        System.out.println(answer);
    }
}
