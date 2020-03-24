package Programmers.Greedy;

import java.util.Arrays;

public class CCTV {

    public int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes);
        System.out.println(routes);

        return answer;
    }

    public static void main(String[] args) {
        int[][] routes = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};
        CCTV solution = new CCTV();
        System.out.println(solution.solution(routes));
    }
}
