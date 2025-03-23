package com.tidesquare.level0;

import com.sun.jdi.ArrayReference;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _할일목록_181885 {
    public static void main(String[] args) {
        String[] todo_list = new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = new boolean[]{true, false, true, false};
        // List<String> answer = new ArrayList<>();
        // for (int i = 0; i < todo_list.length; i++) {
        //     if (!finished[i]) answer.add(todo_list[i]);
        // }
        String[] answer = IntStream.range(0, todo_list.length)
                // true/false 를 뒤집어서 넣음
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(todo_list[i], !finished[i]))
                // 뒤집힌 false 를 true로 처리하면 Lambda 문법 사용이 가능
                .filter(AbstractMap.SimpleEntry::getValue)
                // Key 값으로 map 생성
                .map(AbstractMap.SimpleEntry::getKey)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(answer));
    }
}
/*
public String[] solution(String[] todoList, boolean[] finished) {
    return IntStream.range(0, todoList.length)
        .mapToObj(i -> new AbstractMap.SimpleEntry<>(todoList[i], !finished[i]))
        .filter(AbstractMap.SimpleEntry::getValue)
        .map(AbstractMap.SimpleEntry::getKey)
        .toArray(String[]::new);
    // return IntStream.range(0, finished.length)
    //         .filter(i -> !finished[i])
    //         .mapToObj(i -> todo_list[i])
    //         .toArray(String[]::new);
}
*/