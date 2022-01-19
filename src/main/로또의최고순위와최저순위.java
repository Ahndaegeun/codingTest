package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 로또의최고순위와최저순위 {

    //1	6개 번호가 모두 일치
    //2	5개 번호가 일치
    //3	4개 번호가 일치
    //4	3개 번호가 일치
    //5	2개 번호가 일치
    //6(낙첨)	그 외

    public static int[] solution(int[] lottos, int[] win_nums) {

        int coincide = 0;
        int zeroCnt = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCnt++;
                continue;
            }
            for(int windNum : win_nums) {
                if(lotto == windNum) {
                    coincide++;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = coincide + zeroCnt;
        answer[1] = coincide;

        for(int i = 0; i < 2; i++) {
            switch (answer[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}); // 3, 5
        solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}); // 1, 6
        solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}); // 1, 1
    }
}
