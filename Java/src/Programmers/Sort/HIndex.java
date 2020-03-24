package Programmers.Sort;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < n; i++){
            int h = citations.length - i;
            if(h <= citations[i]) {
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int [] citations = {3, 0, 6, 1, 5};
        int [] citations = {10, 55, 100};
        HIndex solution = new HIndex();
        System.out.println(solution.solution(citations));
    }
}
