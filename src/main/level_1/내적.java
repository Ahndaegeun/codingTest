package main.level_1;

public class 내적 {

    public static int solution(int[] a, int[] b) {
        int answer = calc(a, b);
        return answer;
    }

    private static int calc(int[] a, int[] b) {
        int returnValue = 0;
        for(int i = 0; i < a.length; i++) {
            int result = a[i] * b[i];
            returnValue += result;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4,}, new int[]{-3, -1, 0, 2}); //3
    }
}
