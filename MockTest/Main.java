package MockTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        Solution solution = new Solution();
//        solution.solution(answers);
        System.out.println(Arrays.toString(solution.solution(answers)));

    }
}
