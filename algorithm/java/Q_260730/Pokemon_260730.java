//문제: 폰켓몬
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=python3)
//날짜: 2026-07-30

import java.util.*;

public class Pokemon_260730{
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        return Math.min(nums.length / 2, set.size());
        // set은 중복 허용 안함
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자만 입력하세요: ");
        String[] input = s.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Pokemon_260730 sol =new Pokemon_260730();
        int result = sol.solution(numbers);

        System.out.println(result);
    }
}
