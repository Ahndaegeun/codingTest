package main.level_1;

public class 문자열을정수로 {

    public static int solution(String s) {
        int answer = 0;

        if(s.substring(0, 1).equals("-")) {
            answer = Integer.parseInt(s.substring(1, s.length())) * -1;
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("-1234"); // -1234
    }
}
