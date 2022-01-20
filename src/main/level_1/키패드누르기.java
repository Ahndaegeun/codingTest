package main.level_1;

public class 키패드누르기 {

    // 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
    // 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
    // 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
    // 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
    // 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.

    public static String solution(int[] numbers, String hand) {
        int[][] phone = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {-1, 0, -2}
        };

        StringBuffer answer = new StringBuffer();
        int nowLeft = -1;
        int nowRight = -2;


        for(int num : numbers) {

            switch(num) {
                case 1: case 4: case 7:
                    nowLeft = num;
                    answer.append("L");
                    break;
                case 3: case 6: case 9:
                    nowRight = num;
                    answer.append("R");
                    break;
                default:
                    int leftCnt = 0;
                    int rightCnt = 0;
                    int numPosition = 0;

                    int leftPosition = 0;
                    int rightPosition = 0;

                    if(nowLeft == -1) {
                        leftPosition = 3;
                    } else if(nowRight == -2) {
                        rightPosition = 3;
                    }

                    for(int i = 0; i < phone.length; i++) {
                        if(phone[i][1] == num) {
                            numPosition = i;
                        }

                        if(phone[i][0] == nowLeft) {
                            leftPosition = i;
                            leftCnt++;
                        } else if(phone[i][1] == nowLeft) {
                            leftPosition = i;
                        }

                        if(phone[i][2] == nowRight) {
                            rightPosition = i;
                            rightCnt++;
                        } else if(phone[i][1] == nowRight) {
                            rightPosition = i;
                        }
                    }
                    leftCnt += Math.abs(numPosition - leftPosition);
                    rightCnt += Math.abs(numPosition - rightPosition);

                    if(leftCnt == rightCnt) {
                        if(hand.equals("left")) {
                            nowLeft = num;
                            answer.append("L");
                        } else {
                            nowRight = num;
                            answer.append("R");
                        }
                    } else if(leftCnt < rightCnt) {
                        nowLeft = num;
                        answer.append("L");
                    } else {
                        nowRight = num;
                        answer.append("R");
                    }
            }
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"); // LRLLLRLLRRL
        solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"); // LRLLRRLLLRR
        solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"); // LLRLLRLLRL
    }
}
