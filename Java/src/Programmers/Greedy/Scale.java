package Programmers.Greedy;

import java.util.Arrays;

public class Scale {
    public int solution(int[] weight) {
        int answer = 0;

        Arrays.sort(weight);
        System.out.println(Arrays.toString(weight));
        int max = 0;
        for(int i : weight){
            max += i;
        }
        System.out.println(max);



        return answer;
    }

    public static void main(String[] args) {
        int[] weight = {3, 1, 6, 2, 7, 30, 1};
        Scale solution = new Scale();
        System.out.println(solution.solution(weight));
    }
}
