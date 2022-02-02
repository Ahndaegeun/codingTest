package main.level_2;

public class 단체사진찍기 {

    // {A, C, F, J, M, N, R, T}
    // 어피치, 콘, 프로도, 제이지, 무지, 네오, 라이언, 튜브
    // 첫번째 글자 => 지목한 사람
    // 세번째 글자 => 지목당한 사람
    // 첫번째와 세번째는 항상 다름
    // 두번째 글자는 항상 ~
    // 네번째 글자는 =, <, >
    // 다섯번째 글자는 0이상 6이하, 지목한 사람과 지목당한 사람 사이의 프렌즈 수

    public static int solution(int n, String[] data) {
        int answer = 0;

        for(String d : data) {
            char me = d.charAt(0);
            char target = d.charAt(2);
            char sign = d.charAt(3);
            int distance = Integer.parseInt(d.charAt(4) + "");
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(2, new String[]{"N~F=0", "R~T>2"}); // 3648
//        solution(2, new String[]{"M~C<2", "C~M>1"}); // 0
    }
}
