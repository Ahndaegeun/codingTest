package main.level_1;

import java.util.Arrays;

public class 완주하지못한선수 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if("".equals(answer)) {
            answer = participant[participant.length - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(
                new String[]{"a", "aaa", "a", "aaa", "a", "aaa", "a", "aaa"},
                new String[]{"a", "aaa", "a", "aaa", "a", "aaa",  "aaa"}
        ); // "vinko"
    }
}
