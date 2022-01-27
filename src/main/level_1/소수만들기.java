package main.level_1;

import java.util.*;

public class 소수만들기 {

    public static int solution(int[] nums) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            for(int j = i + 1; j < nums.length - 1; j++) {
                int second = nums[j];
                for(int k = j + 1; k < nums.length; k++) {
                    int third = nums[k];
                    list.add(first + second + third);
                }
            }
        }
        for(int num : list) {
            int i = 1;
            int cnt = 0;
            while(true) {
                if(num % i == 0) {
                    cnt++;
                }
                if(cnt > 2 || i == num) {
                    break;
                }
                i++;
            }
            if(cnt == 2) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        solution(new int[]{1, 2, 3, 4}); // 1
        solution(new int[]{1, 2, 4, 6, 7}); // 4
//        solution(new int[]{1, 2, 3, 4, 5, 6});
    }
}
