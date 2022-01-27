package main.level_1;

import java.util.Arrays;

public class 최소직사각형 {

    public static int solution(int[][] sizes) {
        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;
        for(int[] i : sizes) {
            Arrays.sort(i);
            if(i[0] > w) {
                w = i[0];
            }
            if(i[1] > h) {
                h = i[1];
            }
        }

        return w * h;
    }

    public static void main(String[] args) {
        solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}); // 4000
//        solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}); // 120
//        solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 1}}); // 133
    }
}
