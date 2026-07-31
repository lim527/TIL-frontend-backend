//문제: 약수의 개수와 덧셈
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/77884?language=java)
//날짜: 2026-07-31

import java.util.*;

public class DivisorSum_260731{
    public int solution(int left, int right) {
        int answer=0;
        for(int i=left;i<right+1;i++){
            if(i % Math.sqrt(i) ==0){
                answer-=i;
            }else{
                answer+=i;
            }
        }return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자만 입력하세요: ");
        String[] input= s.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        DivisorSum_260731 sol =new DivisorSum_260731();
        int result = sol.solution(numbers[0],numbers[1]);

        System.out.println(result);
    }
}
