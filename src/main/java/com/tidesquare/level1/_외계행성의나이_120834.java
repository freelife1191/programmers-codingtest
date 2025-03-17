package com.tidesquare.level1;

import java.util.stream.Collectors;

/**
 * Created by mskwon on 2025. 3. 17..
 */
public class _외계행성의나이_120834 {
    public static void main(String[] args) {
        int age = 23;
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            // age%10 는 3이고 3에 'a' char 값을 더하면 알파벳 d
            // 다음 루프에서 age/10은 2이고 age%10 는 2이고 2에 'a' char 값을 더하면 알파벳 c
            char c = (char) ((age % 10) + (int) 'a');
            // offset 0 을 지정하면 insert 시키는 값을 맨 앞으로 넣기 때문에 기존에 들어있던 값이 뒤로 밀림
            // Queue 처럼 활용 가능함 먼저 들어간 값이 나중에 나오도록 조정할 수 있음
            sb.insert(0, c);
            age/=10;
        }

        // Stream
        // char 숫자값에 49를 더하면 알파벳 문자로 변환됨
        // 그래서 2, 3 을 char로 변환해 순서대로 char 값 2(50), 3(51)에 49씩 더해주면 알파벳 c(49+50=99), d(49+51=100) 로 변환됨
        String answer = String.valueOf(age)
                .chars()
                .mapToObj(operand -> String.valueOf((char) (49 + operand)))
                .collect(Collectors.joining());
        System.out.println(answer);
    }
}

/*
public static void main(String[] args) {
    String ageStr = "23";
    char[] ageArr = ageStr.toCharArray();
    int n = 26;
    String[] alphabet = new String[n];
    char currentChar = 'a';
    String answer = "";
    for (int i = 0; i < n; i++) {
        alphabet[i] = String.valueOf(currentChar);
        currentChar++;
    }
    for (char c : ageArr) {
        answer += alphabet[Integer.parseInt(c + "")];
    }
    System.out.println(answer);
}
*/
