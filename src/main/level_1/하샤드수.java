package main.level_1;

public class 하샤드수 {

    public static boolean solution(int x) {
        boolean answer = true;

        String s = x + "";
        char[] chars = s.toCharArray();

        int a = 0;
        for(char c : chars) {
            a += Integer.parseInt(Character.toString(c));
        }

        if(x % a == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(10); // true
        solution(12); // true
        solution(11); // false
    }

}
