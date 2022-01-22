package main.level_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Handler;

public class 체육복 {

    public static int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, String> map = new HashMap<>();
        int cnt = 0;

        for(int r : reserve) {
            map.put(r, "reserve");
        }

        for(int l : lost) {
            if(map.get(l) != null) {
                map.put(l, null);
            } else {
                map.put(l, "lost");
            }
        }

        int minus = 0;
        for(int i = 1; i <= n; i++) {
            if("lost".equals(map.get(i))) {
                if("reserve".equals(map.get(i - 1))) {
                    map.put(i - 1, null);
                    map.put(i, null);
                } else if("reserve".equals(map.get(i + 1))) {
                    map.put(i + 1, null);
                    map.put(i, null);
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            if("lost".equals(map.get(i))) {
                minus++;
            }
        }
        cnt = n - minus;
        return cnt;
    }

    public static void main(String[] args) {
        solution(5, new int[]{3, 5}, new int[]{2, 4});
//        solution(5, new int[]{2, 4}, new int[]{3});
    }
}
