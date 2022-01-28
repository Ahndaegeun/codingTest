package main.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 구명보트 {

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int size = people.length;
        for(int i = 0; i < size; i++) {
            if((people[i] + people[size - 1]) > limit) {
                i--;
            }
            size -= 1;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{70, 50, 80, 50}, 100); // 3
        solution(new int[]{40, 50, 60, 50, 90, 100, 200, 240, 230, 230, 220, 180, 40, 50, 60, 50, 90, 100, 200, 240, 230, 230, 220, 180, 40, 50, 60, 50, 90, 100, 200, 240, 230, 230, 220, 180, 40, 50, 60, 50, 90, 100, 200, 240, 230, 230, 220, 180}, 240); // 2
        solution(new int[]{70, 50, 80}, 100); // 3
    }
}
