package main.level_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int j = 0;
        for(int i : set) {
            answer[j++]  = i;
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{2, 1, 3, 4, 1}); // 2,3,4,5,6,7
    }
}
