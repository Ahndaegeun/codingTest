package main.level_1;

public class 시저암호 {

    public static String solution(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : chars) {
            if(c == 32) {
                sb.append(" ");
            } else if(c >= 97 && c <= 122) {
                if((int)c + n > 122) {
                    int num = c + n - 122;
                    sb.append(Character.toString((char)(96 + num)));
                } else {
                    sb.append(Character.toString((char)((int)c + n)));
                }
            } else if(c >= 65 && c <= 90) {
                if((int)c + n > 90) {
                    int num = c + n - 90;
                    sb.append(Character.toString((char)(64 + num)));
                } else {
                    sb.append(Character.toString((char)((int)c + n)));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        solution("AB", 1); // BC
    }
}
