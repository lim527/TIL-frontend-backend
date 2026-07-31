//문제: 소수 찾기
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12921?language=java)
//날짜: 2026-07-30

import java.util.*;

public class PrimeNumber_260730{
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            boolean prime = true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자만 입력하세요: ");
        int input = s.nextInt();
        PrimeNumber_260730 sol =new PrimeNumber_260730();
        int result = sol.solution(input);
        System.out.println(result);
    }
}
