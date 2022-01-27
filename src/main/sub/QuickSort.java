package main.sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static List<Integer> splitFunc(List<Integer> dataList) {
        if(dataList.size() <= 1) {
            return dataList;
        }
        int pivot = dataList.get(0);
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for(int i = 1; i < dataList.size(); i++) {
            if(dataList.get(i) > pivot) {
                rightList.add(dataList.get(i));
            } else {
                leftList.add(dataList.get(i));
            }
        }
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(splitFunc(leftList));
        mergedList.add(pivot);
        mergedList.addAll(splitFunc(rightList));

        return mergedList;
    }


    public static void main(String[] args) {
        Integer[] array = {4, 2, 1, 7, 5};
        List<Integer> dataList = new ArrayList<>(Arrays.asList(array));
        List<Integer> integers = splitFunc(dataList);
        System.out.println(integers);
    }
}
