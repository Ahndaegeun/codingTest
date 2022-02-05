package main.level_2;

import java.util.*;

public class 양궁대회 {

    public static int[] solution(int n, int[] info) {
        int[] answer = {};

        int apeachScore = 0;
        for(int i = 0; i < info.length; i++) {
            if(info[i] != 0) {
                apeachScore += (10 - i);
            }
        }

        boolean flag = true;
        int index = 0;
        Map<Integer, int[]> map = new HashMap<>();
        Map<Integer, Integer> scoreMinus = new HashMap<>();
        while(flag) {
            int[] lion = new int[11];
            int cnt = 0;
            int apeachTemp = apeachScore;

            for(int i = index; i < info.length; i++) {

                lion[i] = info[i] + 1;
                cnt += info[i] + 1;
                if(info[i] != 0) {
                    apeachTemp -= (10 - i);
                }
                if(cnt > n) {
                    lion[i] = 0;
                    cnt -= info[i] + 1;
                    apeachTemp += (10 - i);
                    continue;
                }
                if(cnt == n) {
                    break;
                }
            }

            int lionScore = 0;
            for(int i = 0; i < lion.length; i++) {
                if(lion[i] != 0) {
                    lionScore += (10 - i);
                }
            }

            if(lionScore > apeachTemp) {
                map.put(index, lion);
                scoreMinus.put(index, lionScore - apeachTemp);
            }
            index++;
            if(index > 10) {
                flag = false;
            }
        }

        if(map.isEmpty()) {
            return new int[]{-1};
        }

        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(scoreMinus.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        int position = entries.get(entries.size() - 1).getKey();
        int temp = entries.get(entries.size() - 1).getValue();
        for(int i = entries.size() - 2; i >= 0; i--) {
            if(temp == entries.get(i).getValue()) {
                temp = entries.get(i).getValue();
                position = entries.get(i).getKey();
            } else if(temp > entries.get(i).getValue()) {
                break;
            }
        }
        answer = map.get(position);
        return answer;
    }

    public static void main(String[] args) {
//        solution(5, new int[]{2,1,1,1,0,0,0,0,0,0,0}); // 0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0
//        solution(1, new int[]{1,0,0,0,0,0,0,0,0,0,0}); // -1
        solution(9, new int[]{0,0,1,2,0,1,1,1,1,1,1}); // 1, 1, 2, 0, 1, 2, 2, 0, 0, 0, 0
        solution(10, new int[]{0,0,0,0,0,0,0,0,3,4,3}); // 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2
    }
}