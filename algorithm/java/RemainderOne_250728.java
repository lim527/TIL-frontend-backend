//문제: 나머지가 1이 되는 수 찾기
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/87389)
// #날짜: 2026-07-28

import java.util.*;

public class RemainderOne_250728 {
    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x < n; x++) {
            if (n % x == 1) {
                answer = x;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("정수를 입력해주세요: ");
        int num=s.nextInt();
        RemainderOne_250728 sol =new RemainderOne_250728();
        int result = sol.solution(num);
        System.out.println(result);
    }
}
