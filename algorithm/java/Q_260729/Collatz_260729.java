//문제: 콜라츠 추측
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12943?language=python3)
//날짜: 2026-07-29

import java.util.*;

public class Collatz_260729{
    public int solution(int n) {
        long num = n;
        for(int cnt=0;cnt<500;cnt++){
            if(num==1){ return cnt;}
            if(num%2 ==0){
                num/=2;
            }
            else{
                num=num*3+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = s.nextInt();
        Collatz_260729 sol = new Collatz_260729();
        int result = sol.solution(num);
        System.out.println(result);
    }
}
