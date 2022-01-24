package main.level_1;

public class 정수제곱근판별 {

    public static long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt - (int)sqrt == 0.0) {
            answer = (long)Math.pow((int)sqrt + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(121); // 144
        solution(3); // -1
    }
}
