package main.level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 큰수만들기 {

    public static String solution(String number, int k) {
        String answer = "";
        char[] chars = number.toCharArray();
        List<String> list = new ArrayList<>();

        String temp = "";
        int start = 0;
        int i = 1;
        while(start  <= number.length() - (number.length() - k)) {
            if(temp.length() == number.length() - k) {
                list.add(temp);
                temp = "";
                if(i >= number.length()) {
                    start++;
                    i = start + 1;
                }
            } else if(temp.length() == 0) {
                temp += chars[start];
            } else if(temp.length() < number.length() - k) {
                temp += chars[i++];
            }
        }
//        Collections.sort(list);
        System.out.println(list);
//        System.out.println(list.get(list.size() - 1));
        return answer;
    }

    public static void main(String[] args) {
//        solution("1924", 2); // 94
        solution("1231234", 3); // 3234
//        solution("4177252841", 4); // 775841
    }
}
