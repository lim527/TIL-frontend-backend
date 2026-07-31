//문제: 문자열 내림차순으로 배치하기
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=python3)
//날짜: 2026-07-30

import java.util.*;

public class StringDescending_260730{
    public String solution(String s) {
        
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = s.nextLine();
        StringDescending_260730 sol =new StringDescending_260730();
        String result =sol.solution(str);
        System.out.println(result);
    }
}
