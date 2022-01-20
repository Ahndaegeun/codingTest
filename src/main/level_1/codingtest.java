package main.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codingtest {
    public static int solution(List<Integer> list) {
        Collections.sort(list);
        while(list.size() != 1) {
            if(list.size() == 0) {
                list.add(0);
                break;
            }

            int removeOne = list.remove(list.size() - 1);
            int removeTwo = list.remove(list.size() - 1);

            if(removeOne - removeTwo != 0) {
                int temp = removeOne - removeTwo;
                boolean isAdd = false;
                for(int i = 0; i < list.size(); i++) {
                    int integer = list.get(i);
                    if(integer >= temp) {
                        list.add(i, temp);
                        isAdd = true;
                        break;
                    }
                }
                if(!isAdd) {
                    list.add(temp);
                }
            }
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(10);
        list.add(35);
        list.add(6);
        list.add(7);
        list.add(3);
        solution(list);
    }
}
