package Programmers.ProgrammersCodingTest;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
            if(budget - d[i] >= 0) {
                budget -= d[i];
                answer++;
            } else {
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Budget solution = new Budget();

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        System.out.println(solution.solution(d, budget));
    }
}