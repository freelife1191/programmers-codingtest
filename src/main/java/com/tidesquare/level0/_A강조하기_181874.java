package com.tidesquare.level0;

/**
 * Created by mskwon on 2025. 3. 18..
 */
public class _A강조하기_181874 {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        // String myString = "PrOgRaMmErS";

        myString = myString.toLowerCase().replace('a', 'A');
        System.out.println(myString);

        /*
        StringBuilder sb = new StringBuilder();
        System.out.println((int) 'a');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');

        // end::[]
        System.out.println((char)('a'-32));
        for (char ch : myString.toCharArray()) {
            if (ch == 97) ch -= 32;
            else if(65 < ch && ch <= 90) ch = Character.toLowerCase(ch);
            sb.append(ch);
        }
        System.out.println(sb);
         */
    }
}
