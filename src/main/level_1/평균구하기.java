package main.level_1;

public class 평균구하기 {

    public static double solution(int[] arr) {
        double answer = 0;

        for(int i : arr) {
            answer += i;
        }

        answer = answer / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4}); // 2.5
    }
}
