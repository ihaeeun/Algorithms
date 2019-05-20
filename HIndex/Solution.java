package HIndex;

import java.util.Arrays;

public class Solution {
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
}
