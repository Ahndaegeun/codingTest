package main.level_1;

import java.util.*;

public class 모의고사 {

    // 1번: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
    // 2번: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
    // 3번: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

    public static int[] solution(int[] answers) {
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] human = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i % 5]) {
                human[0]++;
            }
            if(answers[i] == two[i % 8]) {
                human[1]++;
            }
            if(answers[i] == three[i % 10]) {
                human[2]++;
            }
        }

        int asInt = Arrays.stream(human).max().getAsInt();
        int[] answer = {};
        for(int i = 0; i < 3; i++) {
            if(human[i] == asInt) {
                answer = Arrays.copyOfRange(answer, 0, answer.length + 1);
                answer[answer.length - 1] = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5}); // 1
//        solution(new int[]{1,3,2,4,2}); // 123

    }
}
