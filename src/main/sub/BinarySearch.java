package main.sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static boolean search(List<Integer> dataList, Integer searchItem) {
        if(dataList.size() == 1 && searchItem == dataList.get(0)) {
            return true;
        }

        if(dataList.size() == 1 && searchItem != dataList.get(0)) {
            return false;
        }

        if(dataList.size() == 0) {
            return false;
        }

        int medium = dataList.size() / 2;

        if(searchItem == dataList.get(medium)) {
            return true;
        } else {
            if(searchItem < dataList.get(medium)) {
                return search(new ArrayList<>(dataList.subList(0, medium)), searchItem);
            } else {
                return search(new ArrayList<>(dataList.subList(medium, dataList.size())), searchItem);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add((int)(Math.random() * 100));
        }
        list = QuickSort.splitFunc(list);
        search(list, 20);
    }
}
