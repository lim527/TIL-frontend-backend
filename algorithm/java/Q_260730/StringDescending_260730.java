//문제: 문자열 내림차순으로 배치하기
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=python3)
//날짜: 2026-07-30

import java.util.*;

public class StringDescending_260730{
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);  // 오름차순 정렬
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {  // 뒤에서부터 읽으면 내림차순
        sb.append(arr[i]); 
        }
        return sb.toString();   
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
