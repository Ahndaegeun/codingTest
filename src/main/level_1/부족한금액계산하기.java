package main.level_1;

public class 부족한금액계산하기 {

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += i * price;
        }
        if(money >= total) {
            return 0;
        }
        answer = Math.abs(money - total);
        return answer;
    }

    public static void main(String[] args) {
        solution(3, 40, 4); // 10
    }
}
