package main.level_1;

public class 자릿수더하기 {

    public static int solution(int n) {
        String result = n + "";
        int answer = 0;

        char[] chars = result.toCharArray();
        for(char c : chars) {
            answer += Integer.parseInt(Character.toString(c));
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(123); // 6
    }
}
