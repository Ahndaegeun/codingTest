package main.level_1;

import java.util.ArrayList;
import java.util.List;

public class 비밀지도 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[][] map1 = makeMap(n, arr1);
        String[][] map2 = makeMap(n, arr2);
        String[][] resultMap = resultMap(n, map1, map2);
        int i = 0;
        for(String[] str : resultMap) {
            String a = "";
            for(String str2 : str) {
                a += str2;
            }
            answer[i++] = a;
        }

        return answer;
    }

    public static String[][] makeMap(int n, int[] arr) {
        String[][] result = new String[n][n];
        List<String> list = new ArrayList<>();

        // 2진수 변환 후 list에 추가
        for(int i : arr) {
            list.add(Integer.toBinaryString(i));
        }

        // 2진수 변환된 스트링을 확인해서 1이면 해당 map에 #추가
        int row = 0;
        for(String str : list) {
            if(str.length() < n) {
                for(int i = str.length(); i != n; i++) {
                    str = "0" + str;
                }
            }
            for(int i = 0; i < n; i++) {
                String s = str.substring(i, i + 1);
                if(s.equals("1")) {
                    result[row][i] = "#";
                } else {
                    result[row][i] = "_";
                }
            }
            row += 1;
        }

        return result;
    }

    public static String[][] resultMap(int n, String[][] map1, String[][] map2) {
        String[][] result = new String[n][n];
        for(int i = 0; i < map1.length; i++) {
            for(int j = 0; j < map1[i].length; j++) {
                if((map1[i][j].equals("#") && map2[i][j].equals("_")) || map1[i][j].equals("_") && map2[i][j].equals("#")) {
                    result[i][j] = "#";
                } else if(map1[i][j].equals("#") && map2[i][j].equals("#")) {
                    result[i][j] = "#";
                } else {
                    result[i][j] = " ";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution(5,
                 new int[]{9, 20, 28, 18, 11},
                 new int[]{30, 1, 21, 17, 28});
        // ["#####","# # #", "### #", "# ##", "#####"]
    }
}
