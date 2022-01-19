package main.level_1;

import java.util.*;

public class 신고결과받기 {

    // id_list => 이용자의 아이디 리스트
    // report => 신고자와 피신고자 리스트
    // k => 정지 기준 횟수

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reporterValue = new HashMap<>();
        List<String> respondentList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String id : id_list) {
            map.put(id, 0);
        }

        int[] answer = new int[id_list.length];

        for(String item : report) {
            String[] s = item.split(" ");
            String reporter = s[0];
            String respondent = s[1];

            if(reporterValue.get(reporter) != null) {
                boolean isAdd = reporterValue.get(reporter).add(respondent);
                if(isAdd) {
                    respondentList.add(respondent);
                }
            } else {
                Set<String> set = new HashSet<>();
                set.add(respondent);
                reporterValue.put(reporter, set);
                respondentList.add(respondent);
            }
        }

        List<String> overTheK = new ArrayList<>();
        for(String id : id_list) {
            int frequency = Collections.frequency(respondentList, id);
            if(frequency >= k) {
                overTheK.add(id);
            }
        }

        overTheK.forEach(item -> {
            reporterValue.forEach((key, value) -> {
                if(value.contains(item)) {
                    map.put(key, map.get(key) + 1);
                }
            });
        });

        for(int i = 0; i < id_list.length; i++) {
            answer[i] = map.get(id_list[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2);
//        solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
    }
}
