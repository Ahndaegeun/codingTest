package main.level_1;

public class 가운데글자가져오기 {

    public static String solution(String s) {
        String answer = "";

        int size = s.length();

        if(size % 2 == 0) {
            answer = s.substring(size / 2 - 1, size / 2 + 1);
        } else {
            answer = s.substring(size / 2, size / 2 + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("abcde"); // c
    }
}
