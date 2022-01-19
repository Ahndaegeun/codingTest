package main.level_1;

import java.util.ArrayList;
import java.util.List;

public class 숫자문자열과영단어 {

    public static int solution(String s) {
        String answerString = "";

        char[] chars = s.toCharArray();

        String plusString = "";
        for(char c : chars) {
            if(c >= 48 && c <= 57) {
                answerString += c;
            } else {
                plusString += c;
            }

            switch (plusString) {
                case "zero":
                    answerString += "0";
                    plusString = "";
                    break;
                case "one":
                    answerString += "1";
                    plusString = "";
                    break;
                case "two":
                    answerString += "2";
                    plusString = "";
                    break;
                case "three":
                    answerString += "3";
                    plusString = "";
                    break;
                case "four":
                    answerString += "4";
                    plusString = "";
                    break;
                case "five":
                    answerString += "5";
                    plusString = "";
                    break;
                case "six":
                    answerString += "6";
                    plusString = "";
                    break;
                case "seven":
                    answerString += "7";
                    plusString = "";
                    break;
                case "eight":
                    answerString += "8";
                    plusString = "";
                    break;
                case "nine":
                    answerString += "9";
                    plusString = "";
                    break;
            }
        }

        return Integer.parseInt(answerString);
    }

    public static void main(String[] args) {
        solution("one4seveneight"); // 1478
        solution("23four5six7"); // 234567
        solution("2three45sixseven"); // 234567
        solution("123"); // 123
    }
}
