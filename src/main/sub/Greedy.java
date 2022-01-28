package main.sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Greedy {

    public static void greedyFunc() {

    }

    public static int coinFunc(Integer price, List<Integer> coinList) {
        int totalCoinCount = 0;
        int coinNum = 0;

        List<Integer> details = new ArrayList<>();

        for(int i = 0; i < coinList.size(); i++) {
            coinNum = price / coinList.get(i);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(i);
            details.add(coinNum);
        }
        return totalCoinCount;
    }

    public static void solution(Integer[][] objectList, double capacity) { // 부분 배낭 문제
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1] / o2[0]) - (o1[1] / o1[0]);
            }
        });

        for(int i = 0; i < objectList.length; i++) {
            if((capacity - (double)objectList[i][0]) > 0) {
                capacity -= (double)objectList[i][0];
                totalValue += (double)objectList[i][1];
            } else {
                fraction = capacity / (double)objectList[i][0];
                totalValue += (double)objectList[i][1] * fraction;
                break;
            }
        }
        System.out.println(totalValue);
    }

    public static void main(String[] args) {
        Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        solution(objectList, 30.0);
    }
}
