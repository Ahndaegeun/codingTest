package main.level_1;

public class 자연수뒤집어배열로 {

    public static int[] solution(long n) {
        String s = n + "";
        int[] answer = new int[s.length()];

        for(int i = 0, j = s.length(); i < s.length(); i++, j--) {
            answer[i] = Integer.parseInt(s.substring(j - 1, j));
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(12345); // [5, 4, 3, 2, 1]
    }
}
