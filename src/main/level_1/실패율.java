package main.level_1;

import java.util.*;

public class 실패율 {

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> failRate = new HashMap();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            int clearCnt = 0;
            int totalUser = 0;
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= i) {
                    totalUser++;
                }
                if(stages[j] > i) {
                    clearCnt++;
                }
            }
            double result = (totalUser - clearCnt) / (double)totalUser;
            if(Double.isNaN(result)) {
                result = 0.0;
            }
            failRate.put(i, result);
        }
        List<Map.Entry<Integer, Double>> list_entries = new ArrayList<>(failRate.entrySet());
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Integer, Double> entry : list_entries) {
            list.add(entry.getKey());
        }

        for(int i = 0; i < N; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        // [3, 4, 2, 1, 5]
    }
}
