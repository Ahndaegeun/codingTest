package main.level_1;

import java.util.*;

public class 소수찾기 {

    public static int solution(int n) {
        int answer = 0;

        int[] filter = new int[n + 1];
        Arrays.fill(filter, 1);
        filter[0] = 0;
        filter[1] = 0;

        for (int i = 2; i < Math.sqrt(n) + 1; i++){

            if (filter[i] == 1){
                for (int j = i * 2; j <= n; j+=i){
                    filter[j] = 0;
                }
            }
        }

        for (int check: filter){
            if (check == 1){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(10000);
    }
}
