package main.level_1;

public class x만큼간격이있는n개의숫자 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int i = 0;
        for(long j = 1; j <= n; j++) {
            answer[i++] = x * j;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(2, 5); // [2, 4, 6, 8, 10]
    }
}
