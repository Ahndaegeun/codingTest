package main.level_1;

import java.math.BigDecimal;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        boolean answer = true;
        String s = "dfghjpklkjhgf";
        s = s.toLowerCase();
        if(s.contains("p") || s.contains("y")) {
            int pcnt = 0;
            int ycnt = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'p') {
                    pcnt++;
                }
                if(s.charAt(i) == 'y') {
                    ycnt++;
                }
            }

            if(pcnt != ycnt) {
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
