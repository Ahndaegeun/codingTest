package main.level_1;

import java.util.*;

public class 나누어떨어지는숫자배열 {

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }

        if(list.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{5, 9, 7, 10}, 5); // [5, 10]
    }
}
