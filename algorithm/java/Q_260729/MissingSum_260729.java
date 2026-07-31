//문제: 없는 숫자 더하기
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=python3)
//날짜: 2026-07-29

import java.util.*;

public class MissingSum_260729{
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0;i<numbers.length;i++){
            answer-=numbers[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("배열을 입력하세요: ");
        String[] numbers = s.nextLine().split(" ");
        int[] numArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArray[i] = Integer.parseInt(numbers[i]);
        }
       MissingSum_260729 sol = new MissingSum_260729();
        int result = sol.solution(numArray);
        System.out.println(result);
    }
}
