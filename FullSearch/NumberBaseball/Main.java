package FullSearch.NumberBaseball;

public class Main {
    public static void main(String[] args) {
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        Solution solution = new Solution();
        System.out.println(solution.solution(baseball));
    }
}
