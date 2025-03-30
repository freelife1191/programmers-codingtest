package com.tidesquare.level0;

import java.time.LocalDate;

/**
 * Created by mskwon on 2025. 3. 31..
 */
public class _날짜비교하기_181838 {
    public static void main(String[] args) {
        int[] date1 = new int[]{2021, 12, 28};
        int[] date2 = new int[]{2021, 12, 29};
        boolean before = LocalDate.of(date1[0], date1[1], date1[2]).isBefore(LocalDate.of(date2[0], date2[1], date2[2]));
        System.out.println(before);
        // Java9 부터 사용 가능
        // return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }
}
// 단순하게 년월일에 대한 최소한의 대략적인 계산법으로 숫자 단순 비교
/*
public int solution(int[] date1, int[] date2) {
    int date1Days = getTotalDays(date1);
    int date2Days = getTotalDays(date2);
    return date1Days < date2Days ? 1 : 0;
}

public int getTotalDays(int[] date) {
    int result = 0;
    result += date[0] * 360;
    result += date[1] * 30;
    result += date[2];
    return result;
}
*/
