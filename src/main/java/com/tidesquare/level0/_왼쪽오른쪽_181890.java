package com.tidesquare.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _왼쪽오른쪽_181890 {
    public static void main(String[] args) {
        String[] str_list = new String[]{"u", "u", "l", "r"};
        String[] answer = IntStream.range(0, str_list.length)
                .boxed()
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .map(i -> {
                    if (str_list[i].equals("l")) {
                        return Arrays.copyOfRange(str_list, 0, i);
                    }
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                })
                .orElseGet(() -> new String[]{});
        System.out.println(Arrays.toString(answer));
    }
}
/*
public static void main(String[] args) {
    String[] str_list = new String[]{"u", "u", "l", "r"};
    // str_list = new String[]{"u", "u"};
    int start = 0;
    int end = str_list.length;
    for (int i = 0; i < str_list.length; i++) {
        if (str_list[i].equals("l")) {
            end = i;
            break;
        }
        if(str_list[i].equals("r")) {
            start = i+1;
            break;
        }
    }
    if (start == 0 && end == str_list.length) str_list = new String[]{};
    else str_list = Arrays.copyOfRange(str_list, start, end);
    System.out.println(Arrays.toString(str_list));
}
*/
