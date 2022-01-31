package main.level_2;

import java.util.*;

public class 큰수만들기 {

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int index = 0;
        for(int i = 0; i < number.length() - k; i++) {
            char temp = '0';
            for(int j = index; j <= k + i; j++) {
                if(temp < number.charAt(j)) {
                    index = j + 1;
                    temp = number.charAt(j);
                    if(temp == '9') {
                        break;
                    }
                }
            }
            answer.append(temp);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        solution("1231234", 3); // 3234
        solution("1924", 2); // 94
        solution("4177252841", 4); // 775841
    }
}
