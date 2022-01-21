package main.level_1;

import java.util.Locale;

public class 이상한문자만들기 {

    public static String solution(String s) {

        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for(String str : arr) {
            char[] chars = str.toCharArray();

            for(int i = 0; i < chars.length; i++) {
                if(i % 2 == 0) {
                    sb.append((chars[i] + "").toUpperCase());
                } else {
                    sb.append((chars[i] + "").toLowerCase());
                }
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void main(String[] args) {
        solution("h e l l o"); // TrY HeLlO WoRlD
    }
}
