package main.level_1;

public class 다트게임 {


    public static int solution(String dartResult) {
        int answer = 0;

        String[] dartArr = makeArr(dartResult);
        int[] resultArr = new int[3];

        for(int i = 0; i < 3; i++) {
            int num = 0;
            if(dartArr[i].contains("S")) {
                String strNum = dartArr[i].substring(0, dartArr[i].indexOf("S"));
                num = (int)Math.pow(Integer.parseInt(strNum), 1);
            } else if(dartArr[i].contains("D")) {
                String strNum = dartArr[i].substring(0, dartArr[i].indexOf("D"));
                num = (int)Math.pow(Integer.parseInt(strNum), 2);
            } else if(dartArr[i].contains("T")) {
                String strNum = dartArr[i].substring(0, dartArr[i].indexOf("T"));
                num = (int)Math.pow(Integer.parseInt(strNum), 3);
            }
            resultArr[i] = num;
        }

        for(int i = 0; i < 3; i++) {
            int num = 0;
            if(dartArr[i].contains("*")) {
                resultArr[i] *= 2;
                if (i == 1) {
                    resultArr[i - 1] *= 2;
                } else if(i == 2) {
                    resultArr[i - 1] *= 2;
                }
            } else if(dartArr[i].contains("#")) {
                resultArr[i] *= -1;
            }
        }

        for(int i : resultArr) {
            answer += i;
        }

        return answer;
    }

    public static String[] makeArr(String dartResult) {
        String[] arr = new String[3];
        int position = 0;

        for(int i = 0; i < 2; i++) {
            if (dartResult.substring(position, position + 2).contains("10")) {
                arr[i] = dartResult.substring(position, position + 3);
                position += 3;
                if (dartResult.substring(position, position + 1).contains("#") || dartResult.substring(position, position + 1).contains("*")) {
                    arr[i] = dartResult.substring(position - 3, position + 1);
                    position += 1;
                }
            } else {
                arr[i] = dartResult.substring(position, position + 2);
                position += 2;
                if (dartResult.substring(position, position + 1).contains("#") || dartResult.substring(position, position + 1).contains("*")) {
                    arr[i] = dartResult.substring(position - 2, position + 1);
                    position += 1;
                }
            }
        }

        if (dartResult.substring(position, dartResult.length()).contains("10")) {
            arr[2] = dartResult.substring(position, dartResult.length());
            position += 3;
            if (dartResult.substring(position, dartResult.length()).contains("#") || dartResult.substring(position, dartResult.length()).contains("*")) {
                arr[2] = dartResult.substring(position - 3, dartResult.length());
                position += 1;
            }
        } else {
            arr[2] = dartResult.substring(position, dartResult.length());
            position += 2;
            if (dartResult.substring(position, dartResult.length()).contains("#") || dartResult.substring(position, dartResult.length()).contains("*")) {
                arr[2] = dartResult.substring(position - 2, dartResult.length());
                position += 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        solution("1S2D*3T"); // 37
    }
}
