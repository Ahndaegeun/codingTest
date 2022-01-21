package main.level_1;

public class 문자열다루기기본 {

    public static boolean solution(String s) {
        boolean answer = true;

        try{
            Integer.parseInt(s);
            if(s.length() != 4 && s.length() != 6) {
                answer = false;
            }
        } catch(Exception e) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("a234"); // false
    }
}
