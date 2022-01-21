package main.level_1;

public class 핸드폰번호가리기 {

    public static String solution(String phone_number) {
        int size = phone_number.length();
        String answer = phone_number.substring(size - 4, size);
        for(int i = 0; i < size - 4; i++) {
            answer = "*" + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("01044444444"); // *******4444
    }
}
