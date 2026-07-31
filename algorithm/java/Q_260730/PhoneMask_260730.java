//문제: 핸드폰 번호 가리기
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12948)
//날짜: 2026-07-30

import java.util.*;

public class PhoneMask_260730{
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4)
                + phone_number.substring(phone_number.length() - 4);

        // repeat은 이 수만큼 반복, substring은 거기서 부터 추출
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자만 입력하세요: ");
        String str = s.nextLine();
        PhoneMask_260730 sol =new PhoneMask_260730();
        String result =sol.solution(str);
        System.out.println(result);
    }
}
