package main.level_2;

public class _124나라의숫자 {

    // 1 2 4
    // 11 12 14
    // 21 22 24
    // 41 42 44
    // 111 112 114
    // 121 122 124
    // 141 142 144

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        int lastNum = n % 3 == 0 ? 4 : n % 3;
        int depth = (n - 1) / 3;
        // 길이
        // 앞에 패턴

        System.out.println(lastNum + " " + depth);
        return answer.toString();
    }

    public static void main(String[] args) {
        solution(1); // 1
        solution(2); // 2
        solution(3); // 4
        solution(4); // 11
        solution(14); // 112
    }
}
