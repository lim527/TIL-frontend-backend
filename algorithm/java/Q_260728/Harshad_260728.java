//문제: 하샤드 수
//링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12947)
//날짜: 2026-07-28

import java.util.*;

public class Harshad_260728 {
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
        System.out.print("배열을 입력하세요: ");
        String[] numbers = s.nextLine().split(" ");
        int[] numArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArray[i] = Integer.parseInt(numbers[i]);
        }
        Harshad_260728 sol = new Harshad_260728();
        int[] result = sol.solution(numArray);
        System.out.println(Arrays.toString(result));
    }
}
