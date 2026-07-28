//문제: 자연수 뒤집기 배열로 만들기
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12932)
//날짜: 2026-07-28

import java.util.*;

public class ReverseDigits_250728 {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        long n = s.nextLong();
        ReverseDigits_250728 sol = new ReverseDigits_250728();
        int[] result = sol.solution(n);
        System.out.println(Arrays.toString(result));
    }
}