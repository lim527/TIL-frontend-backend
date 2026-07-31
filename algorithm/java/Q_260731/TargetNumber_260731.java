//문제: 타겟 넘버
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=python3)
//날짜: 2026-07-31

import java.util.*;

public class TargetNumber_260731{
    public int plusmin(int index,int currentsum,int[] numbers,int target){
        if(index==numbers.length){
            if(currentsum == target){
                return 1;
            }
        return 0;
        }else{
            int plus= plusmin(index+1,currentsum+numbers[index],numbers,target);
            int minus=plusmin(index+1,currentsum-numbers[index],numbers,target);
            return plus + minus;
        }
    }
    public int solution(int[] numbers, int target) {
        return plusmin(0,0,numbers,target);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자만 입력하세요: ");
        String[] input= s.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        System.out.print("제한을 입력하세요:");
        int num=s.nextInt();
        TargetNumber_260731 sol =new TargetNumber_260731();
        int result = sol.solution(numbers, num);
        System.out.println(result);
    }
}
