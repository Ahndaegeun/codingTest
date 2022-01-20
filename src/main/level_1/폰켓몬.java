package main.level_1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 폰켓몬 {

    public static int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            boolean isAdd = set.add(num);
            if(isAdd) {
                list.add(num);
            }
        }
        int size = nums.length / 2;
        if(list.size() > size) {
            answer = size;
        } else {
            answer = list.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{3, 1, 2, 3}); // 2
    }
}
