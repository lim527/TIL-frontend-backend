//문제: 예산
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12982)
//날짜: 2026-07-27

import java.util.*;

public class Budget_260727 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int addd = 0;
        for (int i = 0; i < d.length; i++) {
            addd += d[i];
            if (addd > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("배열을 입력해주세요: ");
        String[] input = s.nextLine().split(" ");
        int[] d = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            d[i] = Integer.parseInt(input[i]);
        }
        System.out.print("예산을 입력해주세요: ");
        int budget = s.nextInt();
        Budget_260727 sol =new Budget_260727();
        int result = sol.solution(d, budget);
        System.out.println(result);
    }
}