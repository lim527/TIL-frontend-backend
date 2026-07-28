//문제: 두 개 뽑아서 더하기
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/68644?language=python3)
//날짜: 2026-07-28

import java.util.*;

public class PairSum_250728 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;

        for (int n : set) {
            answer[idx++] = n;
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        String[] input = s.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        PairSum_250728 sol = new PairSum_250728();
        int[] result = sol.solution(numbers);

        System.out.println(Arrays.toString(result));
    }
}