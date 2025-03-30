package com.tidesquare.level0;

import java.math.BigDecimal;

public class _두수의합_181846 {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        StringBuilder sb = new StringBuilder();
        // 덧셈에서 올림수를 저장하는 변수입니다. 예를 들어, 9 + 8 = 17이라면 carry = 1, 결과는 7이 됨
        int carry = 0;
        // 문자열의 끝(일의 자리)부터 시작하기 위해 인덱스를 마지막 위치로 설정
        int i = a.length() - 1, j = b.length() - 1;

        // 이 조건은 덧셈이 끝날 때까지 반복하도록 설계됨
        // i >= 0: a의 남은 자릿수가 있을 때
        // j >= 0: b의 남은 자릿수가 있을 때
        // carry > 0: 더 이상 자릿수는 없지만 올림수가 남아있을 때
        while (i >= 0 || j >= 0 || carry > 0) {
            // sum = carry: 현재 자릿수의 합을 계산하기 위해 이전 자릿수에서 넘어온 올림수를 초기값으로 설정
            int sum = carry;
            System.out.println("i="+i+", j="+j+", carry="+carry+", sum="+sum);
            // '0'의 ASCII 값은 48이므로, '5' - '0' = 53 - 48 = 5처럼 문자에서 숫자 값을 얻음
            // if (i >= 0)와 if (j >= 0): 한쪽 문자열이 더 짧을 경우, 해당 자릿수를 건너뜁
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            // sum % 10: 현재 자릿수의 결과 (0~9 사이의 값)
            // 예: sum = 17라면 17 % 10 = 7
            sb.append(sum % 10);
            System.out.println("sb="+sb);
            // carry = sum / 10: 다음 자릿수로 넘어갈 올림수
            // 예: sum = 17라면 17 / 10 = 1
            carry = sum / 10;
        }
        // 덧셈은 일의 자리부터 시작하므로, sb에는 결과가 역순으로 저장됩니다 (예: "975" 대신 "579"를 얻으려면 뒤집기 필요)
        // reverse()로 순서를 뒤집고, toString()으로 문자열로 반환
        System.out.println(sb.reverse());
    }
}
/*
// 이 코드는 자릿수 단위로 더하기를 수행하며, 초등학교에서 배운 수직 덧셈과 유사한 방식으로 동작함
public String solution(String a, String b) {
    StringBuilder sb = new StringBuilder();
    // 덧셈에서 올림수를 저장하는 변수입니다. 예를 들어, 9 + 8 = 17이라면 carry = 1, 결과는 7이 됨
    int carry = 0;
    // 문자열의 끝(일의 자리)부터 시작하기 위해 인덱스를 마지막 위치로 설정
    int i = a.length() - 1, j = b.length() - 1;

    // 이 조건은 덧셈이 끝날 때까지 반복하도록 설계됨
    // i >= 0: a의 남은 자릿수가 있을 때
    // j >= 0: b의 남은 자릿수가 있을 때
    // carry > 0: 더 이상 자릿수는 없지만 올림수가 남아있을 때
    while (i >= 0 || j >= 0 || carry > 0) {
        // sum = carry: 현재 자릿수의 합을 계산하기 위해 이전 자릿수에서 넘어온 올림수를 초기값으로 설정
        int sum = carry;
        // '0'의 ASCII 값은 48이므로, '5' - '0' = 53 - 48 = 5처럼 문자에서 숫자 값을 얻음
        if (i >= 0) sum += a.charAt(i--) - '0';
        if (j >= 0) sum += b.charAt(j--) - '0';
        sb.append(sum % 10);
        carry = sum / 10;
    }
    return sb.reverse().toString();
}
*/

/*
public static void main(String[] args) {
    String a = "18446744073709551615";
    String b = "287346502836570928366";
    BigDecimal ba = new BigDecimal(a);
    BigDecimal bb = new BigDecimal(b);
    System.out.println(String.valueOf(ba.add(bb)));
}
*/

