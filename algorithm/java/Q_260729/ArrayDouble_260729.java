//문제: 배열 두배 만들기
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/120809)
//날짜: 2026-07-29

import java.util.*;

public class ArrayDouble_260729 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i< numbers.length;i++){
            answer[i]=numbers[i]*2;
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
        ArrayDouble_260729 sol = new ArrayDouble_260729();
        int[] result = sol.solution(numArray);
        System.out.println(Arrays.toString(result));
    }
}
