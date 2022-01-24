package main.level_1;

public class 최대공약수와최소공배수 {

    public static int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = lcm(n, m);
        return new int[]{gcd, lcm};
    }

    // 최대공약수
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소 공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        solution(3, 12); // [3, 12]
    }
}
