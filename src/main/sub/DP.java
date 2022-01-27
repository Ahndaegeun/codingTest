package main.sub;

public class DP {

    public static int dynamic(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < data + 1; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[data];
    }

    public static int fiboFunc(int data) {
        if(data <= 1) {
            return data;
        }
        return fiboFunc(data - 1) + fiboFunc(data - 2);
    }

    public static void main(String[] args) {
        dynamic(10);
        fiboFunc(10);
    }
}
