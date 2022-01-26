package main.level_1;

public class 약수의개수와덧셈 {

    public static int solution(int left, int right) {
        int answer = 0;

        for(int start = left; start <= right; start++) {
            int measureCnt = getMeasureCnt(start);
            answer += measureCnt % 2 == 0 ? start : -start;
        }

        return answer;
    }

    public static int getMeasureCnt(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                if(num / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        solution(13, 17); // 43
//        solution(24, 27); // 52
    }
}
