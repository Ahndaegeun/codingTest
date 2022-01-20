package main.level_1;

import java.util.*;
import java.util.stream.IntStream;

public class 같은숫자는싫어 {

    public static int[] solution(int []arr) {

        List<Integer> list = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(list.size() == 0) {
                list.add(arr[i]);
                j++;
            } else {
                if(list.get(j - 1) != arr[i]) {
                    list.add(arr[i]);
                    j++;
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        solution(new int[]{4, 4, 4, 3, 3});
    }
}
