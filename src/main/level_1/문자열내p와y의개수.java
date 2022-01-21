package main.level_1;

public class 문자열내p와y의개수 {

    public static boolean solution(String s) {
        boolean answer = true;
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

        return answer;
    }

    public static void main(String[] args) {
        solution("pPoooyY"); // true
    }
}
