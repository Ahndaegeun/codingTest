package main.level_1;

public class 두정수사이의합 {


    public static long solution(int a, int b) {
        long answer = 0;

        if(a > b) {
            answer = loop(b, a);
        } else {
            answer = loop(a, b);
        }

        return answer;
    }

    public static long loop(int a, int b) {
        long result = 0;
        for(int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        solution(3, 5); // 12
    }
}
