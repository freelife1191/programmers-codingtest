package com.tidesquare.level0;

import java.util.Arrays;

public class _1로만들기_181880 {
    public static void main(String[] args) {
        int[] num_list = new int[]{12, 4, 15, 1, 14};
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if (num_list[i]%2==0) {
                    answer++;
                    num_list[i]/=2;
                } else {
                    answer++;
                    num_list[i] = (num_list[i]-1)/2;
                }
            }
        }
        System.out.println(answer);
        // binaryString 길이 -1 이 1이 될때까지 나눈 횟수
        // int sum = Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();

        // 10진수 -> 2진수 String : Integer.toHexString(8);
        // 참고로 10진수 -> 16진수(toHexString​) 8진수(toOctalString) 변환도 있다
        // 2진수 -> 10진수 int : Integer.parseInt("1000",2);
        // 10진수 -> 2진수 String
        String b12 = Integer.toBinaryString(12);
        String b4 = Integer.toBinaryString(4);
        String b15 = Integer.toBinaryString(15);
        String b1 = Integer.toBinaryString(1);
        String b14 = Integer.toBinaryString(14);
        System.out.println(12+", b12="+b12+", length="+(b12.length()-1));
        System.out.println(4+", b4="+b4+", length="+(b4.length()-1));
        System.out.println(15+", b15="+b15+", length="+(b15.length()-1));
        System.out.println(1+", b1="+b1+", length="+(b1.length()-1));
        System.out.println(14+", b14="+b14+", length="+(b14.length()-1));
        // for(int i = 0;num_list.length>i;i++){
        //     while(num_list[i]!=1){
        //         num_list[i]/=2;
        //         answer++;
        //     }
        // }

        // int a = 0;
        // for(int i = 0; i < num_list.length; i++){
        //     int j = 0;
        //     while (num_list[i] >= Math.pow(2, j)) {
        //         a = j;
        //         j++;
        //     }
        //     answer += a;
        // }

        // Arrays.stream(num_list)
        //         .map(num -> {
        //             int count = 0;
        //
        //             while (num != 1) {
        //                 num = (num % 2 == 0) ? num / 2 : (num - 1) / 2;
        //                 count++;
        //             }
        //
        //             return count;
        //         })
        //         .sum();
    }
}
