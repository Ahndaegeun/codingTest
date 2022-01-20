package main.level_1;

public class 삼진법뒤집기 {

    public static int solution(int n) {
        StringBuffer sb = new StringBuffer();
        while(n != 0) {
            sb.append(n % 3);
            n = n / 3;
        }


        return Integer.parseInt(sb.toString(), 3);
    }

    public static void main(String[] args) {
        solution(45); // 7
        solution(125); // 229
    }
}
