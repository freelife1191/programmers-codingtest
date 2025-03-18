package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 18..
 */
public class _특정한문자를대문자로바꾸기_181873 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        System.out.println(alp.charAt(0)); // 첫번째 문자
        System.out.println(alp.codePointAt(0)); // 첫번째 문자
        System.out.println("P".codePointAt(0)); // 첫번째 문자
        System.out.println(112 - 32);
        System.out.println((char) (alp.charAt(0) - 32)); // 32를 빼면 대문자로 변환됨
        // my_string = my_string.replaceAll(alp, alp.toUpperCase());
        my_string.replace(alp, ((char)(alp.charAt(0)) - 32) +"");
        System.out.println(my_string);
    }
}
