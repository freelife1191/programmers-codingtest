package com.tidesquare.level0;

public class _커피심부름_181837 {
    public static void main(String[] args) {
        int americano = 4500;
        int cafelatte = 5000;
        String[] order = new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int answer = 0;
        for (String c : order) {
            answer += c.contains("cafelatte") ? 5000 : 4500;
        }
        System.out.println(answer);
    }
}
