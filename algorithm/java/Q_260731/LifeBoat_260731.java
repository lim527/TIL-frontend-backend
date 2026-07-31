//문제: 구명보트
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/42885)
//날짜: 2026-07-31

import java.util.*;

public class LifeBoat_260731{
    public int solution(int[] people, int limit) {
        int answer=0;
        Arrays.sort(people);
        int lo=0;
        int hi =people.length-1;
        while(lo<=hi){
            if(people[lo]+people[hi]<=limit){
                lo+=1;
            }
            hi-=1;
            answer+=1;
        }
        return answer;
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
        LifeBoat_260731 sol =new LifeBoat_260731();
        int result = sol.solution(numbers, num);
        System.out.println(result);
    }
}
