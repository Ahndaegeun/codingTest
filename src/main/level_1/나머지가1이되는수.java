package main.level_1;

public class 나머지가1이되는수 {

    public static int solution(int n) {
        int answer = 0;

        int i = 1;
        while(true) {
            if(n % i == 1) {
                answer = i;
                break;
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(10); // 3
    }
}
