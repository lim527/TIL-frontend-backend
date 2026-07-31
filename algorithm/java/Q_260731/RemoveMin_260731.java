//문제: 제일 작은 수 제거하기
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12935?language=python3)
//날짜: 2026-07-31

import java.util.*;

public class RemoveMin_260731{
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }
        int n =arr[0];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <n){
                n=arr[i];
                ind=i;
            }
        }
        int[] answer =new int[arr.length -1];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(ind!=i){
                answer[idx++] = arr[i];
            }
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
        RemoveMin_260731 sol =new RemoveMin_260731();
        int[] result = sol.solution(numbers);
        System.out.println(Arrays.toString(result));
    }
}
