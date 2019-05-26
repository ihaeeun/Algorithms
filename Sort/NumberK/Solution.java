package Sort.NumberK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    int[] solution(int[] array, int[][] commands) {

        List<Integer> list = new ArrayList<>();

        for(int[] results : commands){
            int[] temp = Arrays.copyOfRange(array, results[0]-1, results[1]);
            Arrays.sort(temp);
            list.add(temp[results[2]-1]);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}