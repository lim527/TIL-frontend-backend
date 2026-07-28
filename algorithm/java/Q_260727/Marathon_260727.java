//문제: 완주하지 못한 선수
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/42576)
//날짜: 2026-07-27

import java.util.*;

public class Marathon_260727 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("참가자 이름을 입력하세요 (공백으로 구분): ");
        String[] participant = s.nextLine().split(" ");
        System.out.print("완주자 이름을 입력하세요 (공백으로 구분): ");
        String[] completion = s.nextLine().split(" ");
        Marathon_260727 sol = new Marathon_260727();
        String result = sol.solution(participant, completion);
        System.out.println(result);
    }
}