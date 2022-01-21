package main.level_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int cnt = 0;
        for(int[] command : commands) {
            List<Integer> list = new ArrayList<>();
            for(int i = command[0] - 1; i < command[1]; i++) {
                list.add(array[i]);
            }
            Collections.sort(list);
            answer[cnt++] = list.get(command[2] - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
//        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}); // 5, 6, 3
    }
}
