// 문제: 짝수와 홀수
// 링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12937?language=java)
// 날짜: 2026-07-27
import java.util.*;

public class EvenOdd_260727 {
    public String solution(int num) {
        String answer = "Odd";
        if(num%2==0) answer="Even";
        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=s.nextInt();
        EvenOdd_260727 sol = new EvenOdd_260727();
        String result = sol.solution(num);
        System.out.println(result);
    }
}