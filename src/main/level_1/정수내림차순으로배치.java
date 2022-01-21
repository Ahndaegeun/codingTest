package main.level_1;

import java.util.Arrays;

public class 정수내림차순으로배치 {

    public static long solution(long n) {
        String s = n + "";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        solution(118372L); // 273811
    }
}
