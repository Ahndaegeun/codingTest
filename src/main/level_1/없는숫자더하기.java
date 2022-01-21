package main.level_1;

public class 없는숫자더하기 {

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers) {
            answer -= i;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}); // 14
    }
}
