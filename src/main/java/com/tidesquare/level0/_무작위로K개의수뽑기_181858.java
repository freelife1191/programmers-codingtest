package com.tidesquare.level0;

import java.util.Arrays;

/**
 * Created by mskwon on 2025. 3. 27..
 */
public class _무작위로K개의수뽑기_181858 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 2, 2, 3};
        arr = new int[]{0, 1, 1, 1, 1};
        int k = 3;
        k = 4;
        int[] answer = new int[k];
        int cnt = 0;
        answer[cnt++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int v = arr[i];
            if (Arrays.stream(answer).noneMatch(n -> n == v)) answer[cnt++] = v;
            if (cnt >= k) break;
        }
        for (int j = cnt; j < k; j++) answer[cnt++] = -1;
        System.out.println(Arrays.toString(answer));
        // distinct 로 중복제거하고 K만큼 -1 로 채운 스트림을 만든다음 concat 으로 병합하고 limit k 만큼 잘라냄
        // IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
        // k만큼 증가시킨 값이 arr 의 중복을 set으로 제거한 사이즈 보다 크거나 같으면 -1 을 채우고
        // 값이 있으면 distinct 로 중복을 제거한 배열값의 현재 k번째 배열값을 추가해서 배열을 생성
        // IntStream.range(0, k).map(i -> i >= Arrays.stream(arr).boxed().collect(Collectors.toSet()).size() ? -1 : Arrays.stream(arr).distinct().toArray()[i]).toArray();
    }
}
/*
public int[] solution(int[] arr, int k) {
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int a : arr)
        if (!arrayList.contains(a))
            arrayList.add(a);

    int idx = 0;
    int[] answer = new int[k];
    for (int i = 0;i < k;i++)
        answer[i] = -1;
    for (int i = 0;i < k && i < arrayList.size();i++)
        answer[i] = arrayList.get(i);
    return answer;
}
*/
