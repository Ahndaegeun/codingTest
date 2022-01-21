package main.level_1;

public class 제일작은수제거 {

    public static int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        int temp = 100000000;

        for(int i = 0; i < arr.length; i++) {
            if(temp > arr[i]) {
                temp = arr[i];
            }
        }

        for(int i = 0, j = 0; i < arr.length; i++) {
            if(temp != arr[i]) {
                answer[j++] = arr[i];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        solution(new int[]{4, 3, 2, 1}); // [4, 3, 2]
    }
}
