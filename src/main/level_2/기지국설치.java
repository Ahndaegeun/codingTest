package main.level_2;

import java.util.Arrays;

public class 기지국설치 {

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int[] aptList = new int[n];

        for(int i : stations) {
            aptList[i - 1] = 1;
            for(int j = 1; j <= w; j++) {
                if((i - 1 - j) >= 0) {
                    aptList[i - 1 - j] = 1;
                }
                if((i - 1 + j) < aptList.length) {
                    aptList[i - 1 + j] = 1;
                }
            }
        }
        int zeroCnt = 0;
        for(int i = 0; i < aptList.length; i++) {
            if(aptList[i] == 1) {
                continue;
            }
            if(aptList[i] == 0) {
                zeroCnt++;
            }
            if(zeroCnt == (w * 2 + 1) || i == aptList.length - 1 || aptList[i + 1] == 1) {
                zeroCnt = 0;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(11, new int[]{4, 11}, 1); // 3
        solution(16, new int[]{9}, 2); // 3
        solution(10, new int[]{}, 1);
    }
}
