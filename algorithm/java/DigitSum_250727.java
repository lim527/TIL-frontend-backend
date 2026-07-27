//문제: 자릿수 더하기
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=python3)
//날짜: 2026-07-27

import java.util.*;

public class DigitSum_250727 {
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            answer += (n%10);
            n/=10;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("정수를 입력해주세요: ");
        int num=s.nextInt();
        DigitSum_250727 sol =new DigitSum_250727();
        int result = sol.solution(num);
        System.out.println(result);
    }
}