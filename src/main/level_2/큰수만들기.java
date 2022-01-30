package main.level_2;

import java.util.*;

public class 큰수만들기 {

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        char[] numberList = number.toCharArray();
        int totalLen = numberList.length - k;
        int start = 0;
        int end = numberList.length - k;


        while(answer.length() < (numberList.length - k)) {
            char temp = numberList[start];
            int index = start;
            for(int i = start; i < end; i++) {
                if(numberList[i] == 9) {
                    temp = numberList[i];
                    index = i;
                    break;
                } else if(numberList[index] < numberList[i]) {
                    temp = numberList[i];
                    index = i;
                }
            }
            answer.append(temp);
            start = index + 1;
            end = numberList.length - (totalLen - answer.length()) + 1;
        }
        System.out.println(answer);
        return answer.toString();
    }

    public static void main(String[] args) {
//        solution("1231234", 3); // 3234
//        solution("1924", 2); // 94
//        solution("4177252841", 4); // 775841
        solution("321924", 2); // 3924

    }
}
