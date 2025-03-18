package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 19..
 */
public class _문자열뒤집기_181905 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        sb.reverse();
        my_string = my_string.substring(0, s) + sb + my_string.substring(e+1);
        System.out.println(my_string);

    }
}
