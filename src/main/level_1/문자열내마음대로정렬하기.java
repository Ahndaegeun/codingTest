package main.level_1;

import java.util.*;

public class 문자열내마음대로정렬하기 {

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<Integer, String> map = new HashMap<>();

        int i = 0;
        for(String str : strings) {
            map.put(i++, Character.toString(str.charAt(n)));
        }

        LinkedList<Map.Entry<Integer, String>> entries = new LinkedList<>(map.entrySet());
        entries.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        Map<String, List<Integer>> duplication = new HashMap<>();

        for(int j = 0; j < entries.size(); j++) {
            if(duplication.get(entries.get(j).getValue()) != null) {
                duplication.get(entries.get(j).getValue()).add(entries.get(j).getKey());
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(entries.get(j).getKey());
                duplication.put(entries.get(j).getValue(), list);
            }
        }
        List<String> keys = new ArrayList<>();
        duplication.forEach((key, value) -> {
            keys.add(key);
        });

        Collections.sort(keys);
        int answerIndex = 0;
        for(String key : keys) {
            List<Integer> indexList = duplication.get(key);
            String[] tempArr = new String[indexList.size()];
            for(int j = 0; j < indexList.size(); j++) {
                tempArr[j] = strings[indexList.get(j)];
            }
            Arrays.sort(tempArr);
            for(int j = 0; j < tempArr.length; j++) {
                answer[answerIndex++] = tempArr[j];
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"ssa", "ssd", "sasa", "sass"}, 2);
//        solution(new String[]{"aea", "ba", "ce", "aee"}, 1);
//        solution(new String[]{"abce", "abcd", "cdx"}, 2);
    }
}
