package StackQueue.FunctionDevelopment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prograss = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5 , 10, 7};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(prograss, speeds)));
    }
}
