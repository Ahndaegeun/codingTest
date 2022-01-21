package main.level_1;

import java.time.LocalDate;

public class _2016년 {

    public static String solution(int a, int b) {
        LocalDate of = LocalDate.of(2016, a, b);
        return of.getDayOfWeek().toString().substring(0, 3);
    }

    public static void main(String[] args) {
        solution(5, 24); // TUE
    }
}
