package main.level_2;

import java.util.*;

public class 가장큰수 {

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        for(int i : numbers) {
            list.add(i);
        }

        List<Integer> sort = sort(list);

        for(int i : sort) {
            answer.append(i);
        }
        System.out.println(answer);
        return answer.toString();
    }

    public static List<Integer> sort(List<Integer> dataList) {
        if(dataList.size() <= 1) {
            return dataList;
        }
        int pivot = dataList.get(0) >= 10 ? Integer.parseInt((dataList.get(0) + "").substring(0, 1)) : dataList.get(0);
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for(int i = 1; i < dataList.size(); i++) {
            int temp = dataList.get(i) >= 10 ? Integer.parseInt((dataList.get(i) + "").substring(0, 1)) : dataList.get(i);
            if(temp < pivot) {
                rightList.add(dataList.get(i));
            } else if(temp > pivot) {
                leftList.add(dataList.get(i));
            } else {
                String s = dataList.get(i) + "";
                if(s.length() >= 2 && s.charAt(s.length() - 1) == '0') {
                    rightList.add(dataList.get(i));
                } else {
                    leftList.add(dataList.get(i));
                }
            }
        }

        List<Integer> mergedList = new ArrayList<>(sort(leftList));
        mergedList.add(dataList.get(0));
        mergedList.addAll(sort(rightList));

        return mergedList;
    }

    public static void main(String[] args) {
        solution(new int[]{6, 10, 2}); // 6210
        solution(new int[]{3, 30, 34, 0, 9}); // 9534330
    }
}
