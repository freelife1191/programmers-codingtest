package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 24..
 */
public class _문자열이_몇번_등장하는지_세기_181871 {
    public static void main(String[] args) {
        String myString = "aaaa";
        String pat = "aa";
        int answer = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                answer++;
            }
        }
        System.out.println(answer);
        // return (int) IntStream.range(0,myString.length()).filter(i -> myString.substring(i).startsWith(pat)).count();
        // return (int) IntStream.rangeClosed(0, myString.length() - pat.length()).mapToObj(i -> myString.substring(i, i + pat.length())).filter(s -> s.equals(pat)).count();
        // return (int) Stream.iterate(0, i -> i + 1)
        //             .limit(myString.length() - pat.length() + 1)
        //             .filter(i -> myString.substring(i, i + pat.length()).equals(pat))
        //             .count();
    }
}

/*
public static void main(String[] args) {
    String myString = "aaaa";
    String pat = "aa";
    int answer = 0;
    int from = 0;
    while (true) {
        int i = myString.indexOf(pat, from);
        if (i == -1) break;
        from = i+1;
        answer++;
    }
    System.out.println(answer);
}
*/
