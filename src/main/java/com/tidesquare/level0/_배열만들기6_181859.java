package com.tidesquare.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mskwon on 2025. 3. 27..
 */
public class _배열만들기6_181859 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 0};
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty()) answer.add(arr[i]);
            else if(arr[i] == answer.get(answer.size()-1)) answer.remove(answer.size()-1);
            else answer.add(arr[i]);
        }
        if (answer.isEmpty()) answer.add(-1);
        System.out.println(answer);
    }
}
/*
public int[] solution(int[] arr) {

    Stack<Integer> stack = new Stack<>();

    for (int no : arr) {
        if (!stack.isEmpty() && no == stack.peek()) {
            stack.pop();
        } else {
            stack.push(no);
        }
    }

    return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
}
*/
