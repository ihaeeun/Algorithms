package Programmers.Heap;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DualPriorityQueue {
    public int[] solution(String[] operations) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for(String operation : operations){
            String command = operation.split(" ")[0];
            int num = Integer.parseInt(operation.split(" ")[1]);

            switch(command){
                case "I":
                    queue.offer(num);
                    break;
                case "D":
                    if(queue.isEmpty())
                        break;
                    switch (num){
                        case 1:
                            while(!queue.isEmpty())
                                deque.offer(queue.poll());
                            deque.pollLast();
                            while(!deque.isEmpty())
                                queue.offer(deque.poll());
                            break;
                        case -1:
                            queue.poll();
                            break;
                    }
            }
        }


        while(!queue.isEmpty()){
            deque.offer(queue.poll());
        }

        if(deque.isEmpty()){
            int[] answer = {0, 0};
            return answer;
        }

        return new int[]{deque.peekLast(), deque.peekFirst()};
    }


    public static void main(String[] args) {
        DualPriorityQueue solution = new DualPriorityQueue();
//        String[] operations = {"I 7", "I 5", "I -5", "D 1"};
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(solution.solution(operations)));
    }
}
