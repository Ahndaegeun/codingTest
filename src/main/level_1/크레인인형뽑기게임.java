package main.level_1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class 크레인인형뽑기게임 {

    public static int solution(int[][] board, int[] moves) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int move : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][move - 1] != 0) {
                    if(!list.isEmpty() && list.get(list.size() - 1) == board[i][move - 1]) {
                        answer += 2;
                        list.remove(list.size() - 1);
                    } else {
                        list.add(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(
            new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
            },
            new int[]{1,5,3,5,1,2,1,4}
        ); // 4
    }
}
