package com.tidesquare.level1;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 4. 2..
 */
public class _진료순서정하기_120835 {
    public static void main(String[] args) {
        int[] emergency = new int[]{3, 76, 24};
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, emergency.length);
        for (int i = 0; i < emergency.length; i++) {
            for (int j = i+1; j < emergency.length; j++) {
                if (emergency[i] > emergency[j]) answer[i]--;
                else answer[j]--;
            }
        }
        System.out.println(Arrays.toString(answer));
        // Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}
/*
public int[] solution(int[] emergency) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
    Arrays.sort(emergencySort);
    int size = emergency.length;
    for(int i = 0; i<emergencySort.length; i++){
        int e = emergencySort[i];
        map.put(e, size-i);
    }
    for(int i = 0; i<emergency.length; i++){
        emergency[i] = map.get(emergency[i]);
    }
    return emergency;
}
*/
/*
public int[] solution(int[] emergency) {
    int[] answer = new int[emergency.length];

    for(int i = 0; i < answer.length; i++){
        if(answer[i] != 0){
            continue;
        }
        int idx = 1;
        for(int j = 0; j < answer.length; j++){
            if(emergency[i] < emergency[j]){
                idx++;
            }
        }
        answer[i] = idx;
    }
    return answer;
}
*/
