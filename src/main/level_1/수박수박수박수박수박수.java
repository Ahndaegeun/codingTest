package main.level_1;

public class 수박수박수박수박수박수 {

    public static String solution(int n) {
        String answer = "";

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(4); // 수박수박
        solution(3); // 수박수
    }
}
