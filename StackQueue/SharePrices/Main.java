package StackQueue.SharePrices;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(prices)));
    }
}
