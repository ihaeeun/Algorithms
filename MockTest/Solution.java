package MockTest;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        int[][] students = {{1,2,3,4,5},
                            {2,1,2,3,2,4,2,5},
                            {3,3,1,1,2,2,4,4,5,5}};

        List<Integer> result = new ArrayList<>();

        int answerNum = answers.length;

        for(int i = 0; i < students.length; i++) {
            int score = 0;
            for (int j = 0; j < answerNum; j++) {
                if(students[i][j % students[i].length] == answers[j]) {
                    score += 1;
                }
            }
            result.add(score);
        }

        int tmax = 0;
        List<Integer> max = new ArrayList<>();


        for(int i = 0; i < result.size(); i++) {
            if(result.get(i) > tmax) {
                tmax = result.get(i);
            }
        }

        for (int i = 0; i < result.size(); i++){
            if(result.get(i) == tmax) {
                max.add(i+1);
            }
        }

        int[] answer = new int[max.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = max.get(i);
        }
        return answer;
    }
}
