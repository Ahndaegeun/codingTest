package main.level_1;

public class 콜라츠추측 {

    public static int solution(int num) {
        int cnt = 0;
        long number = num;

        if(num == 1) {
            return 0;
        }

        while(true) {

            if(number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
            cnt++;

            if(cnt >= 500) {
                cnt = -1;
                break;
            }

            if(number == 1) {
                break;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        solution(1); // 1
        solution(626331); // -1
    }
}
