package main.level_1;

import java.util.Arrays;

public class 문자열내림차순 {

    public static String solution(String s) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();

        for(int i = chars.length - 1; i >= 0; i--) {
            sb.append(Character.toString(chars[i]));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        solution("Zbcdefg"); // gfedcbZ
    }
}
