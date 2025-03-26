package com.tidesquare.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mskwon on 2025. 3. 26..
 */
public class _세개의구분자_181862 {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";
        List<String> answer = new ArrayList<>();
        for (String str :  myStr.strip().split("[abc]+")) {
            if (!str.isBlank()) answer.add(str);
        }
        if (answer.isEmpty()) answer.add("EMPTY");
        // String[] arr = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String[]::new);
        // arr.length == 0 ? new String[] { "EMPTY" } : arr;
        System.out.println(answer);

    }
}
/*
public String[] solution(String myStr) {
    myStr = myStr.replaceAll("[a|b|c]+", ",");
    myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
    myStr = myStr.equals("") ? "EMPTY" : myStr;

    return myStr.split("[,]");
}
*/
/*
public String[] solution(String myStr) {
    String[] answer = {};
    StringTokenizer st = new StringTokenizer(myStr,"abc");
    if(st.countTokens() != 0){
        answer = new String[st.countTokens()];
        for(int i=0; i<answer.length; i++){
            answer[i] = st.nextToken();
        }
    }else{
        answer = new String[1];
        answer[0] = "EMPTY";
    }

    return answer;
}
*/
