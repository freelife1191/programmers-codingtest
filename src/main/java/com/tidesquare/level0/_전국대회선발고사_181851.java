package com.tidesquare.level0;

import java.util.*;
import java.util.stream.IntStream;

public class _전국대회선발고사_181851 {
    public static void main(String[] args) {
        int[] rank = new int[]{3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = new boolean[]{false, true, true, true, true, false, false};
        int answer = IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3L)
                // reduce((current, next) -> current * 100 + next)는 연속적으로 * 100 + 다음 값을 적용하므로, 결과적으로 ((a * 100) + b) * 100 + c를 계산
                // ((2 * 100) + 4) * 100 + 3 = (200 + 4) * 100 + 3 = 204 * 100 + 3 = 20403
                .reduce((current, next) -> current * 100 + next)
                .get();
        // 위의 식은 계산방식이 달라서 틀릴 수 있음 아래의 식이 정확함
        // int[] top3 = IntStream.range(0, rank.length)
        //         .filter(i -> attendance[i])
        //         .boxed()
        //         .sorted(Comparator.comparing(i -> rank[i]))
        //         .limit(3)
        //         .mapToInt(Integer::intValue)
        //         .toArray();
        // int answer = top3[0] * 10000 + top3[1] * 100 + top3[2];
        System.out.println(answer);
    }
    /*
    public static void main(String[] args) {
        int[] rank = new int[]{3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = new boolean[]{false, true, true, true, true, false, false};
        Map<Integer, Integer> pmap= new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) pmap.put(rank[i], i);
        }
        int[] participate = pmap.keySet().stream().mapToInt(i -> i).sorted().limit(3).boxed().mapToInt(pmap::get).toArray();
        System.out.println(Arrays.toString(participate));
        int cal = 10000 * participate[0] + 100 * participate[1] + participate[2];
        System.out.println(cal);
        // return IntStream.range(0, rank.length)
        //         .filter(i -> attendance[i])
        //         .boxed()
        //         .sorted(Comparator.comparing(i -> rank[i]))
        //         .limit(3L)
        //         .reduce((current, next) -> current * 100 + next)
        //         .get();
    }
     */
}
/*
public int solution(int[] rank, boolean[] attendance) {

    PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
    for (int i = 0; i < attendance.length; i++) {
        if (attendance[i])
            que.add(i);
    }

    return que.poll() * 10000 + que.poll() * 100 + que.poll();
}
*/
/*
public static void main(String[] args) {
    int[] rank = new int[]{3, 7, 2, 5, 4, 6, 1};
    boolean[] attendance = new boolean[]{false, true, true, true, true, false, false};
    // 기본형: 우선순위가 낮은 숫자가 먼저 나옴 (작은 숫자)
    // PriorityQueue<Integer> pQ = new PriorityQueue<>();
    // 우선순위가 높은 숫자가 먼저 나옴 (큰 숫자)
    // PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
    // rank[i] 값이 작은 순서대로 sort 하는 우선순위큐를 생성한뒤 거기에 값을 넣으면 정해놓은 순서대로 값이 삽입됨
    // 이 람다 표현식은 비교자(comparator)로, 큐에 들어가는 인덱스(학생 번호)를 rank 배열의 값에 따라 오름차순으로 정렬
    // (a, b) -> rank[a] - rank[b]는 두 요소 a와 b를 비교할 때, rank[a]와 rank[b]의 차이를 기준으로 정렬합니다
    // 만약 rank[a] - rank[b] < 0라면, rank[a]가 더 작으므로 a가 b보다 우선순위가 높습니다(앞에 위치)
    // 만약 rank[a] - rank[b] > 0라면, rank[b]가 더 작으므로 b가 a보다 우선순위가 높습니다
    // 결과적으로, 이 비교자는 rank 값이 작은 순서대로 인덱스를 정렬
    PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
    for (int i = 0; i < attendance.length; i++) {
        if (attendance[i])
            que.add(i);
    }
    System.out.println(que);

    // add() : 우선순위 큐에 원소를 추가. 큐가 꽉 찬 경우 에러 발생
    // offer() : 우선순위 큐에 원소를 추가. 값 추가 실패 시 false를 반환
    // poll() : 우선순위 큐에서 첫 번째 값을 반환하고 제거, 비어있으면 null 반환
    // remove() : 우선순위 큐에서 첫 번째 값을 반환하고 제거, 비어있으면 에러 발생
    // isEmpty() : 우선순위 큐에서 첫 번째 값을 반환하고 제거, 비어있으면 에러 발생
    // clear() : 우선순위 큐를 초기화
    // size() : 우선순위 큐에 포함되어 있는 원소의 수를 반환
    int answer = que.poll() * 10000 + que.poll() * 100 + que.poll();
    System.out.println(answer);
}
*/
