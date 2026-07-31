//문제: 최소직사각형
//링크:(https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=python3)
//날짜: 2026-07-29

import java.util.*;

public class MinRectangle_260729{
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;

        for(int[] size : sizes) {
            wMax = Math.max(wMax, Math.max(size[0], size[1]));
            hMax = Math.max(hMax, Math.min(size[0], size[1]));
        }

        return wMax * hMax;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("가로, 세로를 입력하세요:(끝난뒤 ctrl+z) ");
        ArrayList<int[]> list = new ArrayList<>();

        while (s.hasNextInt()) {
            int w = s.nextInt();
            int h = s.nextInt();
            list.add(new int[]{w, h});
        }

        int[][] sizes = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            sizes[i] = list.get(i);
        }

        MinRectangle_260729 sol = new MinRectangle_260729();
        int result = sol.solution(sizes);
        System.out.println(result);
    }
}
