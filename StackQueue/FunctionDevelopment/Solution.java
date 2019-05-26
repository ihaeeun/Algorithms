package StackQueue.FunctionDevelopment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> day = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++){
            queue.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1);
        }

        int peek;
        while(!queue.isEmpty()){
            peek = queue.poll();
            count++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                if(peek >= queue.peek()){
                    queue.poll();
                    count++;
                }
            }
            day.add(count);
            count = 0;
        }

        int[] answer = new int[day.size()];

        for(int i = 0; i < day.size(); i++){
            answer[i] = day.get(i);
        }

        return answer;
    }
}
