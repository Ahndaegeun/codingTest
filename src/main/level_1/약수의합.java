package main.level_1;

public class 약수의합 {

    public static int solution(int n) {
        int answer = 0;
        if(n == 0) {
            return 0;
        }
        int i = 1;
        while(true) {
            if(n % i == 0) {
                answer += i;
            }

            i++;

            if(i > n) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(12); // 28
    }
}
