package main;

public class 신규아이디추천 {

    public static String solution(String new_id) {
        String answer = new_id;
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-._]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]", "");
        answer = answer.replaceAll("[.]$", "");
        if(answer.length() == 0) {
            answer = "a";
        }
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        if(answer.length() < 3) {
            String lastChar = answer.substring(answer.length() - 1, answer.length());
            for(int i = answer.length(); i < 3; i++) {
                answer = answer + lastChar;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("...!@BaT#*..y.abcdefghijklm"); // bat.y.abcdefghi
        solution("z-+.^."); // z--
        solution("=.="); // aaa
    }
}
